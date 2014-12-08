DESCRIPTION = "Globus Toolkit - GSSAPI Assist library Development Files"
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/xio"
SECTION = "networking"
LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://globus_gatekeeper.c;beginline=2;endline=3;md5=668e921fac7076ab30e0fb2f85db05f3"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-1.debian.tar.xz;name=patch1 \
    "

SRC_URI[archive.md5sum] = "8aa57c4558451186370aa6fbdb2d0311"
SRC_URI[archive.sha256sum] = "17b9cc39d587476ad037e63f33c025c67b1a47ba1552fe091f919af6ef7b3c59"
SRC_URI[patch1.md5sum] = "f6cbc3367b39107be17f1456f00ce118"
SRC_URI[patch1.sha256sum] = "68e1461289a7446d352071f44a29a8bcef4664e92f7cda071e32ec5fb3c82023"

S = "${WORKDIR}/globus_gatekeeper-${PV}"

inherit autotools pkgconfig

FILES_${PN} += "/run /var/run"

RDEPENDS_${PN} = "globus-gsi-sysconfig globus-gssapi-gsi globus-gss-assist"
