// first line comment
<fold text='workspace test'>workspace "test" {
    // workspace line comment
    <fold text='model'>model {
    // model line comment
        <fold text='softwareSystem SoftwareSystem 1'>ss1 = softwareSystem "SoftwareSystem 1"</fold>
        p1 = person "Person 1"

        ss1 -> p1 "ss1->p1"
    }</fold>

    <fold text='views'>views {

    }</fold>
}</fold>