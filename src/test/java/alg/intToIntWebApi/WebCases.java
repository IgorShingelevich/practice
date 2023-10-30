package alg.intToIntWebApi;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum WebCases {

    IS_BUTTON_ENABLED(),
    IS_BUTTON_DISABLED(),
    IS_PLACEHOLDER_DISPLAYED(),
    IS_PLACEHOLDER_HIDDEN(),
    IS_THE_FORM_REFRESHED_AFTER_RELOAD_WITHOUT_SUBMIT(),
    IS_THE_FORM_REFRESHED_AFTER_RELOAD_WITH_SUBMIT(),
    IS_THE_FORM_REFRESHED_AFTER_SUBMIT_WITHOUT_RELOAD(),
    IS_THE_FORM_REFRESHED_AFTER_SUBMIT_WITH_RELOAD(),
    SUBMIT_STRING(),
    SUBMIT_FLOAT(),
    SUBMIT_SYMBOL(),
    SUBMIT_EMPTY(),
    INPUT_LARGE_NUMBER(),
    IS_ERROR_MESSAGE_DISPLAYED(),
    IS_ERROR_MESSAGE_RELATIVE_TO_THE_CASE(),
    IS_FIELD_BORDER_RED_WHEN_ERROR(),
    PASTE_FROM_THE_CLIPBOARD_RELEVANT_TYPE(),
    PASTE_FROM_THE_CLIPBOARD_IRRELEVANT_TYPE()

}