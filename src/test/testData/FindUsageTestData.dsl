// first line comment
workspace "test" {
    // workspace line comment
    model {
    // model line comment
        ss1<caret> = softwareSystem "SoftwareSystem 1"
        p1 = person "Person 1"

        ss1 -> p1 "ss1->p1"
    }
}