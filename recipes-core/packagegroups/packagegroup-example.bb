SUMMARY = "Custom package group for RasperyyPi 2 example"

LICENSE = "MIT"

inherit packagegroup

PACKAGES = "\
    packagegroup-example \
    packagegroup-example-python \
    packagegroup-example-debug \
"

# Components used in example
RDEPENDS_packagegroup-example = "\
    systemd-compat-units \
    linux-firmware \
    psplash \
    telnetd \
    sshd \
    iperf3 \
    cronie \
    parted \
    binutils \
    binutils-symlinks \
    packagegroup-base-wifi \
    bridge-utils \
    iw \
    less \
    sqlite3 \
    networkmanager \
    ntp \
    ntpdate \
    perl \
    xinput-calibrator \
"

RDEPENDS_packagegroup-example-python = "\
    python \
    python-dev \
    python-imaging \
    python-cheetah \
    python-modules \
    python-argparse \
    python-distutils \
    python-numpy \
    python-cython \
    python-pip \
    python-twisted \
    python-six \
    python-mako \
"

# Components used in debug example
RDEPENDS_packagegroup-example-debug = "\
    git \
    autoconf \
    automake \
    cpp \
    cpp-symlinks \
    gcc \
    gcc-symlinks \
    g++ \
    g++-symlinks \
    make \
    libstdc++ \
    libstdc++-dev \
    gdb \
    gdbserver \
    vim \
"

#Note: psplash is not required, but it adds a nice "yocto project" splash screen and loading bar

