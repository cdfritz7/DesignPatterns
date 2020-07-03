from LegalDocumentFactory import LegalDocumentFactory
from ModernDocumentFactory import ModernDocumentFactory

if __name__ == "__main__":

    print("Running Tests")

    legal_factory = LegalDocumentFactory()
    legal_letter = legal_factory.create_letter("Hello, world")
    legal_resume = legal_factory.create_resume("No Work Experience")
    ll_str = legal_letter.get_letter()
    lr_str = legal_resume.get_resume()

    assert(ll_str == """--- Legal ---
--- Letter ---
Hello, world""")
    assert(lr_str == """--- Legal ---
--- Resume ---
No Work Experience""")

    modern_factory = ModernDocumentFactory()
    modern_letter = modern_factory.create_letter("Wherefore art thou")
    modern_resume = modern_factory.create_resume("CEO, McDonalds")
    ml_str = modern_letter.get_letter()
    mr_str = modern_resume.get_resume()

    assert(ml_str == """--- Modern ---
--- Letter ---
Wherefore art thou""")
    assert(mr_str == """--- Modern ---
--- Resume ---
CEO, McDonalds""")

    print("Tests Passed")
