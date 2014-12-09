DESCRIPTION = "Globus Toolkit - GRAM Protocol Library"
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/xio"
SECTION = "networking"
LICENSE = "Apache-2.0"

DEPENDS = "globus-gssapi-gsi globus-gss-assist globus-gssapi-error"

LIC_FILES_CHKSUM = "file://globus_gram_protocol.c;beginline=2;endline=3;md5=c7c837422acdd14cafd3833a2bc8bc69"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-4.debian.tar.xz;name=dpatch \
    "

SRC_URI[archive.md5sum] = "061a1baf5cc2a52242ab036623526dc4"
SRC_URI[archive.sha256sum] = "602dd4e0943df31ebb657c179be2b019254fc53f6bcfca2b99b8487f0bc7a36a"
SRC_URI[dpatch.md5sum] = "1136b182b83c2308722c66f3e41fb283"
SRC_URI[dpatch.sha256sum] = "bdba64d0278bbd1038d7ab6b3ea16119d3057ff7cf2701d282eeb02cb0440f11"

S = "${WORKDIR}/globus_gram_protocol-${PV}"

inherit autotools pkgconfig

FILES_${PN} += "${libdir}/perl/*"

RDEPENDS_${PN} = "globus-gssapi-gsi globus-gss-assist globus-io"
