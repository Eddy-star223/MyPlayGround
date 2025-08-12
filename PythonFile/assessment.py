import random

# Define questions as a list of dictionaries
questions = [
    {
        "question": "What is the capital of France?",
        "options": ["A) Paris", "B) London", "C) Rome", "D) Berlin"],
        "answer": "A"
    },
    {
        "question": "Which planet is known as the Red Planet?",
        "options": ["A) Earth", "B) Mars", "C) Jupiter", "D) Venus"],
        "answer": "B"
    },
    {
        "question": "Who wrote 'Romeo and Juliet'?",
        "options": ["A) Charles Dickens", "B) William Shakespeare", "C) Mark Twain", "D) Jane Austen"],
        "answer": "B"
    },
    {
        "question": "What is the largest ocean on Earth?",
        "options": ["A) Atlantic", "B) Indian", "C) Pacific", "D) Arctic"],
        "answer": "C"
    },
    {
        "question": "Which element has the chemical symbol 'O'?",
        "options": ["A) Gold", "B) Oxygen", "C) Silver", "D) Iron"],
        "answer": "B"
    },
    {
        "question": "What is the square root of 64?",
        "options": ["A) 6", "B) 7", "C) 8", "D) 9"],
        "answer": "C"
    },
    {
        "question": "Who painted the Mona Lisa?",
        "options": ["A) Vincent Van Gogh", "B) Pablo Picasso", "C) Leonardo da Vinci", "D) Claude Monet"],
        "answer": "C"
    },
    {
        "question": "Which country is known as the Land of the Rising Sun?",
        "options": ["A) China", "B) Japan", "C) Thailand", "D) South Korea"],
        "answer": "B"
    },
    {
        "question": "What is the chemical formula for water?",
        "options": ["A) CO2", "B) H2O", "C) O2", "D) NaCl"],
        "answer": "B"
    },
    {
        "question": "Which language is primarily spoken in Brazil?",
        "options": ["A) Spanish", "B) Portuguese", "C) French", "D) English"],
        "answer": "B"
    }
]

# Shuffle questions
random.shuffle(questions)

# Let user pick questions by number
print("Available questions (1-10):")
for i, q in enumerate(questions,







import random

# === All the quiz questions ===
questions = [
    {
        "id": 1,
        "question": "What is the capital of France?",
        "options": ["Berlin", "London", "Paris", "Rome"],
        "answer": 2  # Correct answer is "Paris"
    },
    {
        "id": 2,
        "question": "Which planet is known as the Red Planet?",
        "options": ["Earth", "Mars", "Jupiter", "Venus"],
        "answer": 1
    },
    {
        "id": 3,
        "question": "What is the largest ocean on Earth?",
        "options": ["Atlantic", "Indian", "Pacific", "Arctic"],
        "answer": 2
    },
    {
        "id": 4,
        "question": "What is 2 + 2?",
        "options": ["3", "4", "5", "6"],
        "answer": 1
    },
    {
        "id": 5,
        "question": "Which animal is known as the King of the Jungle?",
        "options": ["Elephant", "Lion", "Tiger", "Giraffe"],
        "answer": 1
    },
    {
        "id": 6,
        "question": "Which language is used to create websites?",
        "options": ["HTML", "Python", "C++", "Java"],
        "answer": 0
    },
    {
        "id": 7,
        "question": "What color is the sky on a clear day?",
        "options": ["Red", "Blue", "Green", "Yellow"],
        "answer": 1
    },
    {
        "id": 8,
        "question": "Which organ pumps blood in the human body?",
        "options": ["Lungs", "Liver", "Heart", "Kidney"],
        "answer": 2
    },
    {
        "id": 9,
        "question": "Which month has 28 days?",
        "options": ["February", "All months", "January", "March"],
        "answer": 1
    },
    {
        "id": 10,
        "question": "Which gas do plants need to make food?",
        "options": ["Oxygen", "Carbon Dioxide", "Nitrogen", "Hydrogen"],
        "answer": 1
    }
]

# === Game memory ===
used_question_ids = set()
removed_options = {}  # keeps track of wrong options used for each question
last_question_id = None
question_1_used = False
score = 0
attempted = 0

# === Reset game ===
def reset_game():
    global used_question_ids, removed_options, last_question_id
    global question_1_used, score, attempted
    used_question_ids = set()
    removed_options = {}
    last_question_id = None
    question_1_used = False
    score = 0
    attempted = 0

# === Get questions that are still allowed ===
def get_available_questions():
    available = []
    for q in questions:
        if q["id"] in used_question_ids:
            continue  # skip if already used
        if q["id"] == last_question_id:
            continue  # skip if same as last
        if q["id"] == 1 and question_1_used:
            continue  # skip if Q1 already used
        available.append(q)
    return available

# === Show question with options A, B, C, D ===
def show_question(question):
    print("\n" + question["question"])
    labels = ['A', 'B', 'C', 'D']
    options = question["options"]

    # Get removed/wrong options for this question
    removed = removed_options.get(question["id"], [])

    for i, option in enumerate(options):
        if i in removed:
            continue  # don't show removed options
        print(f"{labels[i]}. {option}")

# === Main function to ask a question and take input ===
def ask_question(question):
    global score, attempted, last_question_id, question_1_used

    attempts = 0
    correct_index = question["answer"]
    labels = ['A', 'B', 'C', 'D']
    qid = question["id"]

    while attempts < 2:
        show_question(question)
        answer = input("Enter your answer (A-D): ").strip().upper()

        if answer not in labels:
            print("⚠ Please enter A, B, C, or D.")
            continue

        option_index = labels.index(answer)

        # Check if this option was already used
        if option_index in removed_options.get(qid, []):
            print("❗ You've already picked that option. Try another.")
            continue

        if option_index == correct_index:
            print("✅ Correct!")
            score += 1
            attempted += 1
            used_question_ids.add(qid)
            if qid == 1:
                question_1_used = True
            last_question_id = qid
            return
        else:
            print("❌ Wrong answer.")
            # Record this wrong option
            removed_options.setdefault(qid, []).append(option_index)
            attempts += 1

    # After 2 failed tries
    print("😢 You failed this question.")
    attempted += 1
    used_question_ids.add(qid)
    if qid == 1:
        question_1_used = True
    last_question_id = qid