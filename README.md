meta-raspi2-example
====================

This README file contains information on configuring and building a Linux distribution for the Raspberry Pi 2

<b><i>In your Ubuntu machine or VM terminal:</b></i><br>
sudo apt-get update<br>
sudo apt-get dist-upgrade<br>
sudo apt-get install build-essential gettext bison libfile-slurp-perl gawk libncurses-dev autoconf flex doxygen libtool automake libpcre3-dev zlib1g-dev libbz2-dev subversion minicom putty libssl-dev rpm python-pexpect python-svn python-argparse vim tofrodos meld dos2unix cmake uuid-dev ruby transfig libglib2.0-dev xutils-dev lynx-cur gperf autopoint python-dulwich python-dev curl vim diffstat texinfo chrpath openjdk-7-jre sed wget cvs git-core coreutils unzip texi2html libsdl1.2-dev docbook-utils python-pysqlite2 help2man make gcc g++ desktop-file-utils libgl1-mesa-dev libglu1-mesa-dev mercurial groff tree<br>
sudo dpkg-reconfigure dash     ### select 'no'<br>
git clone -b fido git://git.yoctoproject.org/poky.git<br>
cd poky<br>
git clone -b fido git://git.openembedded.org/meta-openembedded.git<br>
git clone git://git.yoctoproject.org/meta-raspberrypi.git<br>
git clone https://github.com/leon-anavi/meta-weston-rpi.git<br>
git clone https://github.com/s-maynard/meta-raspi2-example.git<br>
echo "TEMPLATECONF=${TEMPLATECONF:-meta-raspi2-example/conf}" > .templateconf<br>
source oe-init-build-env<br>
bitbake example-image<br><br>


Additional Information
==============

- The boot splashscreen is located in <b>recipes-core/psplash</b>.  To modify the image, replace <b>psplash-img.png</b><br>
- The IP address information printed above the login prompt is controlled by the scripts in <b>recipes-extra/info</b><br>
- The user creation on first boot is controlled by the scripts in <b>recipes-extra/setup</b><br>
- Build information will be stored on the image root filesystem in <b>/etc/build</b>.

#### To dd a RaspberryPi image from mac shared folder to sdcard
- from the VM on the mac:<br>
sudo cp tmp/deploy/images/raspberrypi2/example-raspberrypi2.rpi-sdimg /media/sf_shared/<br>
- from the terminal on the mac (after the sdcard has been inserted):<br>
make sure your sdcard is disk2!<br>
sudo diskutil list<br>
sudo diskutil unmountDisk /dev/disk2<br>
sudo dd if=/Users/smaynard/shared/example-raspberrypi2.rpi-sdimg of=/dev/rdisk2 bs=4m<br>
sudo diskutil unmountDisk /dev/disk2<br>
