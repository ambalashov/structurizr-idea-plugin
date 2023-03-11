// first line comment
workspace "test" {
    // workspace line comment
    model {

    // model line comment
        ss1 = softwareSystem "SoftwareSystem 1"
        <error descr="Duplicate identifier">ss1</error> = softwareSystem "SoftwareSystem 1"
        p1 = person "Person 1"

        ss1 -> p1 "ss1->p1"
    }

    views {

    }
}