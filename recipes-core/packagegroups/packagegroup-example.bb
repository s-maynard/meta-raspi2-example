SUMMARY = "Custom package group for RasperyyPi 2 example"

LICENSE = "MIT"

inherit packagegroup

PACKAGES = "\
    packagegroup-example-base \
    packagegroup-example-wireless \
    packagegroup-example-tools \
    packagegroup-example-hardware \
    packagegroup-example-weston \
    packagegroup-example-xserver \
    packagegroup-example-windowmanager \
    packagegroup-example-python \
    packagegroup-example-debug \
"

# Components used in example
RDEPENDS_packagegroup-example-base = "\
    linux-firmware \
    psplash \
    sudo \
    bash \
    telnetd \
    sshd \
    ntp \
    ntpdate \
    ntp-utils \
    perl \
"

# Components used in example
RDEPENDS_packagegroup-example-wireless = "\
    packagegroup-base-wifi \
    bridge-utils \
    iw \
    networkmanager \
"

RDEPENDS_packagegroup-example-tools = "\
    iperf3 \
    cronie \
    parted \
    binutils \
    binutils-symlinks \
    less \
    sqlite3 \
"

RDEPENDS_packagegroup-example-hardware = "\
    wiringpi \
    rpio \
    rpi-gpio \
"

RDEPENDS_packagegroup-example-weston = "\
    wayland \
    weston \
    weston-init \
    weston-examples \
    gtk+3-demo \
"

RDEPENDS_packagegroup-example-xserver = "\
    packagegroup-core-x11 \
    packagegroup-core-x11-base \
    packagegroup-core-x11-utils \
    packagegroup-fonts-truetype-core \
    localedef \
    libx11-locale \
    libxi \
    libxtst \
    xserver-nodm-init \
    xserver-xf86-config \
    xorg-minimal-fonts \
    xkeyboard-config \
    setxkbmap \
    xkbcomp \
    xmodmap \
    xrdb \
    rgb \
    xprop \
    xterm \
"

RDEPENDS_packagegroup-example-windowmanager = "\
    matchbox-wm \
    matchbox-session \
    matchbox-desktop \
    matchbox-panel \
    mini-x-session \
    libmatchbox \
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
    libtool \
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

