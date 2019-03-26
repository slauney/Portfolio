# -*- coding: utf-8 -*-

# Form implementation generated from reading ui file 'e:\PROG1700\414242-Slaunwhite-Zach\TechChecks\TC7\taxCalculator.ui'
#
# Created by: PyQt5 UI code generator 5.10.1
#
# WARNING! All changes made in this file will be lost!

from PyQt5 import QtCore, QtGui, QtWidgets

class Ui_Dialog(object):
    def setupUi(self, Dialog):
        Dialog.setObjectName("Dialog")
        Dialog.resize(630, 476)
        font = QtGui.QFont()
        font.setPointSize(12)
        Dialog.setFont(font)
        self.weeklySalary_label = QtWidgets.QLabel(Dialog)
        self.weeklySalary_label.setGeometry(QtCore.QRect(30, 60, 251, 31))
        font = QtGui.QFont()
        font.setPointSize(12)
        font.setBold(False)
        font.setWeight(50)
        self.weeklySalary_label.setFont(font)
        self.weeklySalary_label.setObjectName("weeklySalary_label")
        self.dependant_label = QtWidgets.QLabel(Dialog)
        self.dependant_label.setGeometry(QtCore.QRect(30, 130, 301, 31))
        font = QtGui.QFont()
        font.setPointSize(12)
        font.setBold(False)
        font.setWeight(50)
        self.dependant_label.setFont(font)
        self.dependant_label.setObjectName("dependant_label")
        self.calculateTax_button = QtWidgets.QPushButton(Dialog)
        self.calculateTax_button.setGeometry(QtCore.QRect(250, 210, 121, 31))
        self.calculateTax_button.setObjectName("calculateTax_button")
        self.dependant_lineEdit = QtWidgets.QLineEdit(Dialog)
        self.dependant_lineEdit.setGeometry(QtCore.QRect(420, 140, 113, 20))
        self.dependant_lineEdit.setObjectName("dependant_lineEdit")
        self.salary_lineEdit = QtWidgets.QLineEdit(Dialog)
        self.salary_lineEdit.setGeometry(QtCore.QRect(420, 70, 113, 20))
        self.salary_lineEdit.setObjectName("salary_lineEdit")
        self.provincialTaxWithheld_label = QtWidgets.QLabel(Dialog)
        self.provincialTaxWithheld_label.setGeometry(QtCore.QRect(30, 290, 531, 21))
        self.provincialTaxWithheld_label.setObjectName("provincialTaxWithheld_label")
        self.federalTaxWithheld_label = QtWidgets.QLabel(Dialog)
        self.federalTaxWithheld_label.setGeometry(QtCore.QRect(30, 310, 501, 21))
        self.federalTaxWithheld_label.setObjectName("federalTaxWithheld_label")
        self.dependantReduction_label = QtWidgets.QLabel(Dialog)
        self.dependantReduction_label.setGeometry(QtCore.QRect(30, 330, 511, 21))
        self.dependantReduction_label.setObjectName("dependantReduction_label")
        self.totalWithheld_label = QtWidgets.QLabel(Dialog)
        self.totalWithheld_label.setGeometry(QtCore.QRect(30, 350, 561, 21))
        self.totalWithheld_label.setObjectName("totalWithheld_label")
        self.totalTakeHome_label = QtWidgets.QLabel(Dialog)
        self.totalTakeHome_label.setGeometry(QtCore.QRect(30, 370, 551, 21))
        self.totalTakeHome_label.setObjectName("totalTakeHome_label")

        self.retranslateUi(Dialog)
        QtCore.QMetaObject.connectSlotsByName(Dialog)

    def retranslateUi(self, Dialog):
        _translate = QtCore.QCoreApplication.translate
        Dialog.setWindowTitle(_translate("Dialog", "Dialog"))
        self.weeklySalary_label.setText(_translate("Dialog", "What is your weekly salary?"))
        self.dependant_label.setText(_translate("Dialog", "How many dependants do you have?"))
        self.calculateTax_button.setText(_translate("Dialog", "CalculateTax"))
        self.provincialTaxWithheld_label.setText(_translate("Dialog", "Provincial Tax Withheld: "))
        self.federalTaxWithheld_label.setText(_translate("Dialog", "Federal Tax Withheld: "))
        self.dependantReduction_label.setText(_translate("Dialog", "Dependant Deduction for dependants: "))
        self.totalWithheld_label.setText(_translate("Dialog", "Total Withheld: "))
        self.totalTakeHome_label.setText(_translate("Dialog", "Total Take-Home Pay: "))

