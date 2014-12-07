DESCRIPTION = " "
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/gsiopenssh"
SECTION = "networking"
LICENSE = "Apache-2.0"
DEPENDS = "globus-openssl-module"

LIC_FILES_CHKSUM = "file://library/globus_gsi_cert_utils.c;beginline=4;endline=5;md5=736323dfba47917c4dfc5a209af4e5f6"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-3.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "93e6706c49cd68ebabcac7f555738318"
SRC_URI[archive.sha256sum] = "35b7e46e1630321c237e03f9d033c0fc20334dd1275f3e18f0900b9e93f89417"
SRC_URI[dpatch.md5sum] = "e3404ba3082aa6aa79e18731f9a92ba8"
SRC_URI[dpatch.sha256sum] = "d8a44ffb83e962a96c40f665c16540c585e685660be02f2de1ebf52441055499"

S = "${WORKDIR}/globus_gsi_cert_utils-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-openssl-module"
