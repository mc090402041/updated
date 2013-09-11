package com.example.mydream;

public class Contact {

                //private variables
                int _id;
                String Dream;
                String Interpretation;
                String Author;

                // Empty constructor
                public Contact() {
                }

                public Contact(String Dream) {
                        this.Dream = Dream;
                }

                // constructor
                public Contact(int id, String Dream, String Interpretation, String Author) {
                        this._id = id;
                        this.Dream = Dream;
                        this.Interpretation = Interpretation;
                        this.Author = Author;
                }

                // constructor;
                public Contact(String Dream, String Interpretation, String Author) {
                        this.Dream = Dream;
                        this.Interpretation = Interpretation;
                        this.Author = Author;
                }


                // getting ID
                public int getID() {
                        return this._id;
                }

                // setting id
                public void setID(int id) {
                        this._id = id;
                }

                // getting name
                public String getDream() {
                        return this.Dream;
                }

                // setting name
                public void setDream(String Dream) {
                        this.Dream = Dream;
                }

                // getting phone number
                public String getInterpretation() {
                        return this.Interpretation;
                }

                // setting phone number
                public void setInterpretation(String Interpretation) {
                        this.Interpretation = Interpretation;
                }

                public String getAuthor() {
                        return this.Author;
                }

                // setting phone number
                public void setAuthor(String Author) {
                        this.Author = Author;
                }

                public String toString() {
                        return Dream;
                }
        }