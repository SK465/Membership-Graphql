# Membership-Graphql
Graphql implementation for membership-project

Exposed endpoint at 
http://localhost:8080/graphiql

Query a single member

{
  getMember(memberId: 262830) {
    fname
    dob
    memberAddress {
      isActive
    }
    visibilityScope {
      visibilityScopeHash
    }
    serviceChannelAccount {
      channel
    }
  }
}




Query all members [skip is (index) and first is (size)]

{
  getAllMembers(skip:0,first:10){
    fname
  }
}


Query all members with criteria

{
  getFilteredMembers(filter: {isActive: false}) {
    fname
    emailId
    dob
  }
}

{
  getFilteredMembers(filter: {isActive: false, fname:"Jane"}) {
    fname
    emailId
    dob
  }
}








