DESCRIPTION = " Globus Toolkit - Globus XIO GSI Driver Development Files"
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/xio"
SECTION = "networking"
LICENSE = "Apache-2.0"

DEPENDS = "globus-xio globus-gssapi-error"

LIC_FILES_CHKSUM = "file://globus_xio_gsi.c;beginline=2;endline=3;md5=c7c837422acdd14cafd3833a2bc8bc69"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-3.debian.tar.xz;name=dpatch \
    "

SRC_URI[archive.md5sum] = "7638e9d5ff72a89327296c31c0eb198c"
SRC_URI[archive.sha256sum] = "f9a4a19af35aa597b1478d8b89f89bddfc787eecec6302bcd91daabbd35c7c12"
SRC_URI[dpatch.md5sum] = "bf208e55c17139bd082fbb3d359f184b"
SRC_URI[dpatch.sha256sum] = "ffc1f02105612a4fc273ac9742e9a225942f23d42ea849a14eb957c400c2be16"

S = "${WORKDIR}/globus_xio_gsi_driver-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-xio globus-gssapi-error globus-gsi-proxy-ssl globus-gsi-sysconfig globus-gsi-proxy-core globus-gssapi-gsi globus-gss-assist globus-gsi-credential globus-callout globus-gsi-cert-utils globus-gsi-callback"
