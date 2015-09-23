LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

COMPATIBLE_MACHINE = "raspberrypi2"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " \
    file://config.txt \
    file://cmdline.txt \
    file://mz61581-overlay.dtb \
    "

S = "${WORKDIR}"

inherit deploy

do_deploy() {
    install -d ${DEPLOYDIR}/bcm2835-bootfiles
    install -d ${DEPLOYDIR}/bcm2835-bootfiles/overlays

    cp ${S}/config.txt ${DEPLOYDIR}/bcm2835-bootfiles/
    cp ${S}/cmdline.txt ${DEPLOYDIR}/bcm2835-bootfiles/
    cp ${S}/mz61581-overlay.dtb ${DEPLOYDIR}/bcm2835-bootfiles/overlays
}

addtask deploy before do_package after do_install
do_deploy[dirs] += "${DEPLOYDIR}/bcm2835-bootfiles"

PACKAGE_ARCH = "${MACHINE_ARCH}"
