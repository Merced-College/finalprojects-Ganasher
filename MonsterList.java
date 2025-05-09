class MonsterList {
    private MonsterNode head;

    public void add(String name) {
        MonsterNode newNode = new MonsterNode(name);
        if (head == null) {
            head = newNode;
        } else {
            MonsterNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printDefeatedMonsters() {
        System.out.println("You have defeated the following monsters:");
        MonsterNode current = head;
        while (current != null) {
            System.out.println("- " + current.name);
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}