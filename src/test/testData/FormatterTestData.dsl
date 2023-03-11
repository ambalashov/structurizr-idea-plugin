// first line comment
workspace   "test"   {
    // workspace line comment
    model {
    // model line comment
    p1   = person "Person 1"
    ss1    =  softwareSystem "SoftwareSystem 1"

    ss1  ->    p1 "ss1->p1"
       }

    views {

  }
}