meta-raspi2-example
====================

This README file contains information on configuring and building a Linux distribution for the Raspberry Pi 2

To build for the Raspberry Pi 2:<br>
1) $ <b><i>cd ~</i></b><br>
2) $ <b><i>git clone -b fido git://git.yoctoproject.org/poky.git</i></b><br>
5) $ <b><i>cd poky</i></b><br>
6) $ <b><i>git clone -b fido git://git.openembedded.org/meta-openembedded.git</i></b><br>
7) $ <b><i>git clone -b fido git://git.yoctoproject.org/meta-raspberrypi.git</i></b><br>
8) $ <b><i>git clone https://github.com/s-maynard/meta-raspi2-example.git</i></b><br>
9) $ <b><i>MACHINE=raspberrypi2 source oe-init-build-env</i></b><br>
10) edit conf/bblayers.conf, ensuring that the following layers are present in BBLAYERS:<br>
<b>NOTE</b> - You must replace "~" with the fully qualified path (/home/&lt;your_username&gt;)<br>
  ~/poky/meta-raspi2-example \\<br>
  ~/poky/meta-raspberrypi \\<br>
  ~/poky/meta-openembedded/meta-networking \\<br>
  ~/poky/meta-openembedded/meta-oe \\<br>
  ~/poky/meta-openembedded/meta-python \\<br>
11) $ <b><i>MACHINE=raspberrypi2 bitbake example-image</i></b><br><br>


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
