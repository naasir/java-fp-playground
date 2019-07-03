java_library(
    name = "lib",
    srcs = glob(["src/main/java/**/*.java"]),
    resources = glob(["src/main/resources/**"]),
    deps = [],
)

# For more information, see https://github.com/junit-team/junit5-samples/tree/master/junit5-jupiter-starter-bazel
load("//:junit5.bzl", "java_junit5_test")

java_junit5_test(
    name = "junit5-test",
    srcs = glob(["src/test/java/**/*.java"]),
    test_package = "org.naasir.javafpplayground",
    deps = [
         ":lib",
#         "@maven//:org_junit_jupiter_junit_jupiter_api",
    ],
)