// first line comment
workspace "test" {
    // workspace line comment
    model {
    // model line comment
        ss_ref = softwareSystem "SoftwareSystem 1"
        p1 = person "Person 1"

        ss_ref -> p1 "ss1->p1"
    }
}