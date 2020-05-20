package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import business.Contact;

public class ContactManagerApp {

	public static void main(String[] args) {
		System.out.println("Contact Manager App");
		System.out.println("-------------------");
		System.out.println();

		// contacts ArrayList
		List<Contact> contacts = new ArrayList<>();

		// create new contacts
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));

		// print a list of all contacts
		System.out.println("All contacts:");
		displayContacts(contacts);
		System.out.println();

		// filter contacts using the Predicate interface
		System.out.println("Contacts no phone:");
		List<Contact> contactsNoPhone = filterContacts(contacts, c -> c.getPhone() == null);
		displayContacts(contactsNoPhone);
		System.out.println();

		// filter contacts using the Predicate interface
		System.out.println("Contacts no email:");
		List<Contact> contactsNoEmail = filterContacts(contacts, c -> c.getEmail() == null);
		displayContacts(contactsNoEmail);
		System.out.println();

		// filter contacts using the Predicate interface
		System.out.println("Contacts no email nor phone:");
		List<Contact> contactsNoEmailNoPhone = filterContacts(contacts,
				c -> c.getEmail() == null && c.getPhone() == null);
		displayContacts(contactsNoEmailNoPhone);
		System.out.println();

		// filter contacts using the Predicate interface
		System.out.println("Contacts with last name of Murach:");
		List<Contact> contactsMurach = filterContacts(contacts, c -> c.getName().contains("Murach"));
		displayContacts(contactsMurach);
		System.out.println();

		// process contact list using the Consumer interface
		System.out.println("Process contact list - print out the names:");
		processContacts(contacts, c -> System.out.println(c.getName()));
		System.out.println();

		// code that changes the list to uppercase, using the Consumer interface
//		System.out.println("Process contact list - convert each name to uppercase:");
//		processContacts(contacts, c -> c.setName(c.getName().toUpperCase()));
//		displayContacts(contacts); // we are affecting the original list, not a new list
//		System.out.println();

		// transform contact list using the function interface
		System.out.println("Transform contact to list of strings (name: phone):");
		List<String> contactPhoneNumbers = transformContacts(contacts, c -> {
			String phone  = (c.getPhone() == null) ? "n/a" : c.getPhone();
			return c.getName() + ": " + phone;
		});
		for (String s: contactPhoneNumbers) {
			System.out.println(s);
		}

	}

	private static void displayContacts(List<Contact> contacts) {
		for (Contact c : contacts) {
			System.out.println(c);
		}
	}

	private static List<Contact> filterContacts(List<Contact> contacts, Predicate<Contact> condition) {
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c : contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		return filteredContacts;
	}

	private static List<String> transformContacts(List<Contact> contacts, Function<Contact, String> function) {
		List<String> strings = new ArrayList<>();
		for (Contact c : contacts) {
			strings.add(function.apply(c));
		}
		return strings;
	}

	private static void processContacts(List<Contact> contacts, Consumer<Contact> consumer) {
		for (Contact c : contacts) {
			consumer.accept(c);
		}
	}

}
