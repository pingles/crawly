(ns crawly.app
  (:import
    [java.util Properties])
  (:require
    [clojure.contrib.str-utils2 :as str])
  (:gen-class
    :main false 
    :implements [com.eightylegs.customer.I80App]))

(defn -getVersion
  "Returns the version name of the interface implemented. Must be
  set correctly for 80legs to work correctly."
  [this]
  "80App_1.2")
  
(defn -initialize
  "Initialises the app. This should deserialize any data if necessary
  and store the properties object if passing parameters this way.
  props contains contains user selected parameters from the web.
  data is byte[] of data to accompany the job. It should be
  deserialised into something useful."
  [this properties, data])
  
(defn -parseLinks
  "Parse links from the content of the document. Each document matching
  the 80legs crawl parameters will be passed in. document-content will always
  be decompressed, dechunked byte[]. Must return Collection<String> or null.
  null indicates use of 80legs will use its own default parseLinks(). an
  empty list means no links will be parsed."
  [this, document-content, url, headers, app-properties, status-code-line]
  nil ; 80legs will use its own default parseLinks().
  )

(defn -processDocument
  "Analyses the content of a crawled document. Each document matching your
  specified 80legs analysis parameters will be passed into this method.
  Result is a byte[] of the result.
  headers Map<String, String>.
  Map<Default80AppPropertyKeys, Object>"
  [this, document-content, url, headers, app-properties, status-code-line]
  (if (str/contains? (String. document-content) "Apple") (.getBytes (str "Apple," url))))


;;  Implements I80App interface:
;; 
;; getVersion
;; initialize
;; parseLinks
;; processDocument

; crawly.app