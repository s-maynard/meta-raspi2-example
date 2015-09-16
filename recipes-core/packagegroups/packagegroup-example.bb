SUMMARY = "Custom package group for RasperyyPi 2 example"

LICENSE = "MIT"

inherit packagegroup

PACKAGES = "\
    packagegroup-example \
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
    python-dev \
    python-imaging \
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

