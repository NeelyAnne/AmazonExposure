package com.talentpath.awsimageupload.datastore;

import com.talentpath.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("4bc55880-f768-4339-a0d1-12e3ce449341"), "neelymann", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("926753cc-ed66-4d3f-9b84-b5f09045b92d"), "drakedawson", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("53c17b30-13d5-4641-8642-cbdb2328c427"), "dillonkennedy", null));
//      UUID.randomUUID()
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
