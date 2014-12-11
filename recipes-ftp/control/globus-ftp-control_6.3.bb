DESCRIPTION = "Globus Toolkit - GridFTP Control Library Development Files"
HOMEPAGE = "http://toolkit.globus.org/toolkit"
SECTION = "networking"
LICENSE = "Apache-2.0"

DEPENDS = "globus-io"

LIC_FILES_CHKSUM = "file://globus_ftp_control.c;beginline=4;endline=5;md5=736323dfba47917c4dfc5a209af4e5f6"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-1.debian.tar.xz;name=dpatch \
    "

SRC_URI[archive.md5sum] = "49d9394ea2567127b8fbaf82f9d37cc8"
SRC_URI[archive.sha256sum] = "9d54ac5c9874c4294b4d75377aff4c5b3a93f9b4389f96aa3a12b738c5db8eb3"
SRC_URI[dpatch.md5sum] = "9c6ace632b306c61d63cb777409076e4"
SRC_URI[dpatch.sha256sum] = "b1b7035abce5e24701b2306dc22f50a01694dd96d47f12f8b60ee1ee60f5d61d"

S = "${WORKDIR}/globus_ftp_control-${PV}"

inherit autotools pkgconfig
