DESCRIPTION = "Globus packagegroup for Poky"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

PACKAGES = "\
    packagegroup-core-globus \
    "

RDEPENDS_packagegroup-core-globus = "\
    packagegroup-globus-core \
    "

SUMMARY_packagegroup-globus-core = "Globus Core packages"
RDEPENDS_packagegroup-globus-core = "\
    globus-common \
    globus-gsi-openssl-error \
    globus-gsi-proxy-ssl \
    globus-openssl-module \
    globus-gsi-sysconfig  \
    globus-gsi-cert-utils \
    globus-gsi-callback \
    globus-gsi-credential \
    "
