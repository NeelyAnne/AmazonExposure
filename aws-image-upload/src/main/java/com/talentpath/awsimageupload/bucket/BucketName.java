package com.talentpath.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("talentpath-image-upload-123");

    private final String bucketName;

    public String getBucketName() {
        return bucketName;
    }

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }


}
