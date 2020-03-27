Install A Machine with NVIDIA Optimus drivers and CUDA
Use a Fedora 29 distribution

dnf update

reboot

dnf install https://download1.rpmfusion.org/free/fedora/rpmfusion-free-release-$(rpm -E %fedora).noarch.rpm https://download1.rpmfusion.org/nonfree/fedora/rpmfusion-nonfree-release-$(rpm -E %fedora).noarch.rpm

dnf install xorg-x11-drv-nvidia akmod-nvidia

dnf install xorg-x11-drv-nvidia-cuda

dnf install xorg-x11-drv-nvidia-devel

wget http://developer.download.nvidia.com/compute/cuda/10.2/Prod/local_installers/cuda_10.2.89_440.33.01_linux.run

sudo sh cuda_10.2.89_440.33.01_linux.run
(do not install drivers)

sudo vi /etc/profile
export PATH=$PATH:/usr/local/cuda-10.2/bin
export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:/usr/local/cuda-10.2/lib64

logout login


git clone https://github.com/pjreddie/darknet
cd darknet
vi Makefile
change for CUDA and openCL

dnf install gcc-c++

wget https://pjreddie.com/media/files/yolov3.weights

./darknet detector demo cfg/coco.data cfg/yolov3.cfg yolov3.weights

dnf install libcurl
dnf install libcurl-devel
dnf install openssl-devel





