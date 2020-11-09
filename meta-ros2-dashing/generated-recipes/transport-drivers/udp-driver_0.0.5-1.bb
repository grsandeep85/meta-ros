# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "A template class and associated utilities which encapsulate basic reading from UDP sockets"
AUTHOR = "Apex.AI, Inc. <opensource@apex.ai>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=bb69307f9a8566360ce04a9b7e6a00b7"

ROS_CN = "transport_drivers"
ROS_BPN = "udp_driver"

ROS_BUILD_DEPENDS = " \
    boost \
    rclcpp \
    rclcpp-lifecycle \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    rclcpp \
    rclcpp-lifecycle \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    rclcpp \
    rclcpp-lifecycle \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-drivers-gbp/transport_drivers-release/archive/release/dashing/udp_driver/0.0.5-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/udp_driver"
SRC_URI = "git://github.com/ros-drivers-gbp/transport_drivers-release;${ROS_BRANCH};protocol=https"
SRCREV = "f397f0453f499982761d83751ded9903922e3777"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
