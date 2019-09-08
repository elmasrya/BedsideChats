package com.example.bedsidechats.dummy

import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<DummyItem> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, DummyItem> = HashMap()


    init {
        // Add 3 sample items.
        addItem(DummyItem("Instructions", "...",
            "Hi there! This deck of cards contains 29 questions and conversation topics. Take a few minutes to read the different cards. Set aside and organize the cards that you’d like to discuss with your doctor based on your personal preferences and priorities. Your doctor will make opportunities to discuss 1-3 of the cards at a time.\n" +
                    "\n" +
                    "Bedside Chats™ is brought to you by the Ohio State University. \n"))
        addItem(DummyItem("1", "1",
            "What do I need to do and what needs to happen before I can go home?"))
        addItem(DummyItem("2", "2",
            "Where do you anticipate I will be discharged to?"))
        addItem(DummyItem("3", "3",
            "What are the risks involved with my test?"))
        addItem(DummyItem("4", "4",
            "Who are the people that will come into my room?"))
        addItem(DummyItem("5", "5",
            "What role do you play in my care?"))
        addItem(DummyItem("6", "6",
            "Did you start me on any new medications?"))
        addItem(DummyItem("7", "7",
            "How can I avoid coming back to the hospital?"))
        addItem(DummyItem("8", "8",
            "Let’s discuss my healthcare goals."))
        addItem(DummyItem("9", "9",
            "What is your favorite hobby?"))
        addItem(DummyItem("10", "10",
            "What things are important to you in life?"))
        addItem(DummyItem("11", "11",
            "What brought you to Columbus? "))
        addItem(DummyItem("12", "12",
            "Why did you choose this profession?"))
        addItem(DummyItem("13", "13",
            "Have you seen a case like mine before?"))
        addItem(DummyItem("14", "14",
            "Could I die or become disabled because of my illness?"))
        addItem(DummyItem("15", "15",
            "Despite this disease, is there anything I can do to live a healthier life?"))
        addItem(DummyItem("16", "16",
            "I don’t understand_________"))
        addItem(DummyItem("17", "17",
            "I’m scared about _____"))
        addItem(DummyItem("18", "18",
            "I wish  _________"))
        addItem(DummyItem("19", "19",
            "I think you should know ________"))
        addItem(DummyItem("20", "20",
            "I feel _________ "))
        addItem(DummyItem("21", "21",
            "I’ve been told ___ by one doctor and ___ by another doctor, can you help me understand?"))
        addItem(DummyItem("22", "22",
            "I forgot to tell you ______"))
        addItem(DummyItem("23", "23",
            "From a physician standpoint, what is your goal for my healthcare?"))
        addItem(DummyItem("24", "24",
            "How will I know if I am getting sick again?"))
        addItem(DummyItem("25", "25",
            "If my disease gets worse, what will that mean for me?"))
        addItem(DummyItem("26", "26",
            "What would you bring with you if you were stuck on an island? "))
        addItem(DummyItem("27", "27",
            "If you could have any animal safely as a pet, what would it be? "))
        addItem(DummyItem("28", "28",
            "Share one thing on your bucket list."))
        addItem(DummyItem("29", "29",
            "_________ (fill in your own question)"))
    }

    /*
    private val COUNT = 27

    init {
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createDummyItem(i))
        }
    }
    */

    private fun addItem(item: DummyItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    /*
    private fun createDummyItem(position: Int): DummyItem {
        return DummyItem(position.toString(), "Item " + position, makeDetails(position))
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }
    */
    /**
     * A dummy item representing a piece of content.
     */
    data class DummyItem(val id: String, val content: String, val details: String) {
        override fun toString(): String = content
    }
}
