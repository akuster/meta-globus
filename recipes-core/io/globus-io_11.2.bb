DESCRIPTION = " Globus Toolkit - Globus XIO Framework"
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/xio"
SECTION = "networking"
LICENSE = "Apache-2.0"
DEPENDS = "globus-xio-gsi-driver globus-gssapi-error globus-gss-assist"

LIC_FILES_CHKSUM = "file://globus_io_error_hierarchy.c;beginline=2;endline=3;md5=c7c837422acdd14cafd3833a2bc8bc69"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-1.debian.tar.xz;name=patch1 \
    "
SRC_URI[archive.md5sum] = "0db3a85285c20eb3501f27a73b8c54d8"
SRC_URI[archive.sha256sum] = "124a5d78f0bd1fe4a58f15ace8d10ca04e7c31f92940b8b8327e521f401e9845"
SRC_URI[patch1.md5sum] = "cccfdeba4297cc61751e61b780b44a8a"
SRC_URI[patch1.sha256sum] = "ebfa9d2f1b22a0c1935a492c53f59cb1ae0ec98d812cce48ed58ec449a657769"

S = "${WORKDIR}/globus_io-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-gsi-sysconfig globus-openssl-module globus-gss-assist globus-gsi-credential globus-gsi-proxy-core globus-gssapi-error globus-gssapi-gsi globus-callout globus-xio"
