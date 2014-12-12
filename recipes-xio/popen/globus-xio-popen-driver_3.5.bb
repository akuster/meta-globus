DESCRIPTION = "Globus Toolkit - Globus XIO Pipe Open Driver Development Files"
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/xio"
SECTION = "networking"
LICENSE = "Apache-2.0"

DEPENDS = "globus-xio"

LIC_FILES_CHKSUM = "file://globus_xio_popen_driver.c;beginline=2;endline=3;md5=9898108665dd602e41273315a49d4efa"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-1.debian.tar.xz;name=dpatch \
    "

SRC_URI[archive.md5sum] = "01f0a745a34e20827b8f9f60a85b42d2"
SRC_URI[archive.sha256sum] = "0605891c9497263605c9f5620a2edebdf958d3462339abcbe4cb8337325adc2a"
SRC_URI[dpatch.md5sum] = "67d6308eb95065400c7301d06a20d27a"
SRC_URI[dpatch.sha256sum] = "bb7f182a3162180e41006a535b68a3bfcfdcaff5972b686c61f02194aafebf6d"

S = "${WORKDIR}/globus_xio_popen_driver-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-xio"
