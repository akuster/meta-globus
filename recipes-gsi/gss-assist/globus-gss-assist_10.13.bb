DESCRIPTION = "Globus Toolkit - GSSAPI Assist library Development Files"
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/xio"
SECTION = "networking"
LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://init.c;beginline=2;endline=3;md5=c7c837422acdd14cafd3833a2bc8bc69"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-1.debian.tar.xz;name=patch1 \
    "

SRC_URI[archive.md5sum] = "0e589f0420c4f3725c9c0c2056ed262c"
SRC_URI[archive.sha256sum] = "54292d097a652f0db9bc264ec91e8808773fed9332208f671843a35fad637cb9"
SRC_URI[patch1.md5sum] = "5b817e3968436981bfb14a7cc60f2125"
SRC_URI[patch1.sha256sum] = "76f0ff4da333659d69189d9588db180ca0f566fd6ad028b6b43e62cfa6f7fa5c"

S = "${WORKDIR}/globus_gss_assist-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-gsi-callback  globus-gsi-sysconfig globus-gsi-proxy-core globus-callout globus-gsi-credential globus-gssapi-gsi"
