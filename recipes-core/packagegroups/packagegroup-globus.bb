SUMMARY = "Globus"
DESCRIPTION = "Globus Toolkit packagegroup"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

PACKAGES = "\
    packagegroup-globus \
    packagegroup-globus-core \
    packagegroup-globus-security \
    packagegroup-globus-gram \
    "

RDEPENDS_packagegroup-globus = "\
    packagegroup-globus-core \
    packagegroup-globus-security \
    packagegroup-globus-gram \
    "

SUMMARY_packagegroup-globus-core = "Globus Core packages"
RDEPENDS_packagegroup-globus-core = "\
    globus-common \
    globus-xio \
    globus-gsi-openssl-error \
    globus-gsi-proxy-ssl \
    globus-openssl-module \
    globus-gsi-sysconfig  \
    globus-gsi-cert-utils \
    globus-gsi-callback \
    globus-gssapi-gsi \
    globus-callout \
    globus-gss-assist \
    globus-gatekeeper \
    globus-gssapi-error \
    globus-xio-gsi-driver \
    globus-io \
    globus-scheduler-event-generator \
    "

SUMMARY_packagegroup-globus-security = "Globus Security packages"
RDEPENDS_packagegroup-globus-security = "\
    globus-gsi-credential \
    globus-gsi-proxy-core \
    globus-proxy-utils \
    globus-simple-ca \
    "

SUMMARY_packagegroup-globus-gram = "Globus GRAM packages"
RDEPENDS_packagegroup-globus-gram = "\
    globus-gram-protocol \
    "
