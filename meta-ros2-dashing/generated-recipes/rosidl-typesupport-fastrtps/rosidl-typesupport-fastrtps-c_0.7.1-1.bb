# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Generate the C interfaces for eProsima FastRTPS."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Ricardo González"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rosidl_typesupport_fastrtps"
ROS_BPN = "rosidl_typesupport_fastrtps_c"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    fastcdr-native \
    fastrtps-cmake-module-native \
    fastrtps-native \
    rosidl-cmake-native \
    rosidl-generator-c-native \
    rosidl-typesupport-fastrtps-cpp-native \
"

ROS_EXPORT_DEPENDS = " \
    rmw \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-native \
    fastcdr-native \
    fastrtps-cmake-module-native \
    fastrtps-native \
    rosidl-cmake-native \
    rosidl-generator-c-native \
    rosidl-typesupport-fastrtps-cpp-native \
"

ROS_EXEC_DEPENDS = " \
    rosidl-parser \
    rosidl-typesupport-interface \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rosidl_typesupport_fastrtps-release/archive/release/dashing/rosidl_typesupport_fastrtps_c/0.7.1-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/rosidl_typesupport_fastrtps_c"
SRC_URI = "git://github.com/ros2-gbp/rosidl_typesupport_fastrtps-release;${ROS_BRANCH};protocol=https"
SRCREV = "22515d7d1c6ef6692ff7aa661399f6f42533decc"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
