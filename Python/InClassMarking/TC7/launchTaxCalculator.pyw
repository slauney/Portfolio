import sys

from PyQt5.QtWidgets import QApplication, QMainWindow
from PyQt5.QtGui import QPixmap

#import generated UI file here
import Ui_taxCalculator

class MyForm(QMainWindow, Ui_taxCalculator.Ui_Dialog):

        #DO NOT MODIFY THIS SECTION OF CODE
    def __init__(self, parent=None):
        super(MyForm, self).__init__(parent)
        self.setupUi(self)
        #END DO NOT MODIFY

        #ADD SLOTS HERE
        #slot for detecting when the checkbox is checked or unchecked
        self.calculateTax_button.clicked.connect(self.buttonPushed)
        


    #ADD SLOT FUNCTIONS HERE
    #function to execute when the checkbox slot is activated (checked or unchecked in UI)


    #ADD ALL OTHER HELPER FUNCTIONS HERE
    def buttonPushed(self):
        salary = self.salary_lineEdit.text()
        numOfDependants = self.dependant_lineEdit.text()
        self.calculateTax(salary, numOfDependants)
        


    def calculateTax(self, salary, numOfDependants):
        provTaxPercent = 0.06
        fedTaxPercent = 0.25
        depDeduction = 0.02
        try:
            provicialTaxAmount = float(salary) * provTaxPercent 
            federalTaxAmount = float(salary) * fedTaxPercent
            dependantAmountDeducted = float(salary) * (int(numOfDependants) * depDeduction)
            totalWithheld = provicialTaxAmount + federalTaxAmount - dependantAmountDeducted
            totalTakeHomeAmount = float(salary) - totalWithheld
            self.provincialTaxWithheld_label.setText("Provincial Tax Withheld: ${:.2f}".format(provicialTaxAmount))
            self.federalTaxWithheld_label.setText("Federal Tax Withheld: ${:.2f}".format(federalTaxAmount))
            self.dependantReduction_label.setText("Dependant Deduction for {} dependants: ${:.2f}".format(numOfDependants, dependantAmountDeducted))
            self.totalWithheld_label.setText("Total Withheld: ${:.2f}".format(totalWithheld))
            self.totalTakeHome_label.setText("Total Take-Home Pay: ${:.2f}".format(totalTakeHomeAmount))
        except:
            self.salary_lineEdit.setText("")
            self.dependant_lineEdit.setText("")
    

#DO NOT MODIFY THIS SECTION OF CODE
if __name__ == "__main__":
    app = QApplication(sys.argv)
    the_form = MyForm()
    the_form.show()
    sys.exit(app.exec_())
#END DO NOT MODIFY