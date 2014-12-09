DESCRIPTION = "Simple File Server Implementation using GASS Server API"
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/gsiopenssh"
SECTION = "networking"
LICENSE = "Apache-2.0"

DEPENDS = "globus-gss-assist globus-gssapi-gsi globus-gass-transfer"

LIC_FILES_CHKSUM = "file://globus_gass_server.c;beginline=4;endline=5;md5=736323dfba47917c4dfc5a209af4e5f6"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-1.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "3de99977416c21dc1045c9c49fc40d13"
SRC_URI[archive.sha256sum] = "becea07a5ddd0f0719b08d40b8481ace1f72d7de9df1f449192562ef47c1b077"
SRC_URI[dpatch.md5sum] = "567b4e860c4e3611ea135ac19aea2a2c"
SRC_URI[dpatch.sha256sum] = "edc35623a2b9f5afc1576723ec3e0cd6bfebe7b1de38fe661a8c5ebd912cadc0"

S = "${WORKDIR}/globus_gass_server_ez-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-gass-transfer"
