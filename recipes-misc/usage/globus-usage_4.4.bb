DESCRIPTION = "Globus Toolkit - Usage Library Development Files"
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/xio"
SECTION = "networking"
LICENSE = "Apache-2.0"
DEPENDS = "globus-xio"

LIC_FILES_CHKSUM = "file://globus_usage.c;beginline=2;endline=3;md5=c7c837422acdd14cafd3833a2bc8bc69"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-1.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "52c3012404f072965f9ebccf2cb28813"
SRC_URI[archive.sha256sum] = "d12b2bd7160dd7666f6b120174d9859136f4230fac2da3ee50f3d8403870cae5"
SRC_URI[dpatch.md5sum] = "606b75b650277266eaf499db466c78b5"
SRC_URI[dpatch.sha256sum] = "2d2ff759c2740cf20c2f64b8a029c48421383f6b462578583b3fa45012666518"

S = "${WORKDIR}/globus_usage-${PV}"

inherit autotools pkgconfig
