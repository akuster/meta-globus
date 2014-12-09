DESCRIPTION = " "
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/gsiopenssh"
SECTION = "networking"
LICENSE = "Apache-2.0"
DEPENDS = "libtool globus-common"

LIC_FILES_CHKSUM = "file://library/globus_callout.c;beginline=4;endline=5;md5=736323dfba47917c4dfc5a209af4e5f6"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-3.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "120a55e4f088259d03f594c7e96f7621"
SRC_URI[archive.sha256sum] = "25a2adc1390ed19464c66d2a99e6a0acf6d1a112c255a3450af52a28c9278438"
SRC_URI[dpatch.md5sum] = "a42e27f5aa20523c7b1402aa9f3837b0"
SRC_URI[dpatch.sha256sum] = "1a5318845fe62c0652e826362886acabe225fdef5b4122bb3ccd6f339ee0c45d"

S = "${WORKDIR}/globus_callout-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-common"
