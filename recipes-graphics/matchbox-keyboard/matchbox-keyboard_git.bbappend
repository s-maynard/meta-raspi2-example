
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " \
    file://matchbox-keyboard.patch \
    file://toggle-matchbox-keyboard.sh \
           "

do_install_append () {
    install -m 777 ${WORKDIR}/toggle-matchbox-keyboard.sh -t ${D}/usr/bin
}

