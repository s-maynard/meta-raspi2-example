SUMMARY = "An image for a Raspberry Pi 2 yocto build"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

DISTRO_FEATURES_append = " wayland"

#IMAGE_FEATURES += "splash package-management x11 x11-base hwcodecs"
IMAGE_FEATURES += "package-management hwcodecs"

IMAGE_ROOTFS_SIZE = "8192"

# Expands the SD card root partition, but makes the image huge
# for a 4GB SD card...
#IMAGE_ROOTFS_EXTRA_SPACE = "3145728"
# Give some extra space for development and experimentation
#IMAGE_ROOTFS_EXTRA_SPACE = "250000"
# a better compromise 2GB of free space + rootfs (about 2.5GB total)
IMAGE_ROOTFS_EXTRA_SPACE = "2097152"

inherit core-image
inherit image-buildinfo

IMAGE_INSTALL_append += " \
    rpi-first-run-setup \
    show-ip-address \
    packagegroup-example-base \
    packagegroup-example-wireless \
    packagegroup-example-weston \
    packagegroup-example-debug \
"

IMAGE_INSTALL_append_qemux86 += " \
	"

IMAGE_INSTALL_append_qemuarm += " \
	"

IMAGE_INSTALL_append_raspberrypi += " \
    kernel-modules \
	"
IMAGE_INSTALL_append_raspberrypi2 += " \
    kernel-modules \
	"

export IMAGE_BASENAME = "example"

# append extra info to the /etc/build file
buildinfo_append () {
    echo "" >> ${IMAGE_ROOTFS}${sysconfdir}/build
    echo "Build Date: `date`" >> ${IMAGE_ROOTFS}${sysconfdir}/build
}

