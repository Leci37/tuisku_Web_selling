//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: CRWD_1Min_1ADX_50297a96 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_1Min_1ADX_50297a96", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_1Min_50297a96(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( smoothedDirectionalMovementMinus <= 0.199543 )
		if( diMinus <= 51.5286 )
			if( dx <= 55.1506 )
				if( smoothedDirectionalMovementPlus <= 0.296216 )
					if( diMinus <= 50.0046 )
						if( smoothedTrueRange <= 1.11985 )
							if( directionalMovementPlus <= 0.885291 )
								if( smoothedTrueRange <= 0.537386 )
									ret := 0.002370
								if( smoothedTrueRange > 0.537386 )
									ret := -0.033973
							if( directionalMovementPlus > 0.885291 )
								if( diPlus <= 70.2907 )
									ret := -0.420918
								if( diPlus > 70.2907 )
									ret := 0.450000
						if( smoothedTrueRange > 1.11985 )
							if( diPlus <= 18.9187 )
								if( adx <= 43.6446 )
									ret := -0.677419
								if( adx > 43.6446 )
									ret := 0.846154 // buy
							if( diPlus > 18.9187 )
								if( diMinus <= 8.99338 )
									ret := 0.363636
								if( diMinus > 8.99338 )
									ret := 0.808824 // buy
					if( diMinus > 50.0046 )
						if( smoothedDirectionalMovementPlus <= 0.057223 )
							if( smoothedTrueRange <= 0.120875 )
								if( diMinus <= 50.6472 )
									ret := -0.153846
								if( diMinus > 50.6472 )
									ret := -0.533333
							if( smoothedTrueRange > 0.120875 )
								if( dx <= 27.0558 )
									ret := 0.800000 // buy
								if( dx > 27.0558 )
									ret := 0.083333
						if( smoothedDirectionalMovementPlus > 0.057223 )
							if( adx <= 48.231 )
								if( directionalMovementPlus <= 2.2e-05 )
									ret := -0.116883
								if( directionalMovementPlus > 2.2e-05 )
									ret := -0.758065 // sell
							if( adx > 48.231 )
								ret := 0.400000
				if( smoothedDirectionalMovementPlus > 0.296216 )
					if( smoothedTrueRange <= 0.76177 )
						if( adx <= 56.8115 )
							if( smoothedTrueRange <= 0.493311 )
								if( dx <= 48.3523 )
									ret := -0.018868
								if( dx > 48.3523 )
									ret := 0.868421 // buy
							if( smoothedTrueRange > 0.493311 )
								if( smoothedTrueRange <= 0.64634 )
									ret := -0.232759
								if( smoothedTrueRange > 0.64634 )
									ret := 0.159763
						if( adx > 56.8115 )
							if( adx <= 61.3454 )
								ret := 1.000000 // buy
							if( adx > 61.3454 )
								ret := 0.600000
					if( smoothedTrueRange > 0.76177 )
						if( dx <= 49.3137 )
							if( diMinus <= 15.2242 )
								if( diPlus <= 36.2971 )
									ret := 0.156156
								if( diPlus > 36.2971 )
									ret := -0.372093
							if( diMinus > 15.2242 )
								if( smoothedDirectionalMovementMinus <= 0.167949 )
									ret := -0.616000
								if( smoothedDirectionalMovementMinus > 0.167949 )
									ret := -0.145729
						if( dx > 49.3137 )
							if( smoothedDirectionalMovementMinus <= 0.172086 )
								if( diMinus <= 11.3201 )
									ret := -0.588710
								if( diMinus > 11.3201 )
									ret := -0.819820 // sell
							if( smoothedDirectionalMovementMinus > 0.172086 )
								if( adx <= 33.8773 )
									ret := 0.764706 // buy
								if( adx > 33.8773 )
									ret := -0.611111
			if( dx > 55.1506 )
				if( smoothedTrueRange <= 0.477072 )
					if( directionalMovementPlus <= 0.824639 )
						if( smoothedDirectionalMovementPlus <= 0.207196 )
							if( diPlus <= 57.4431 )
								if( adx <= 36.0386 )
									ret := 0.057788
								if( adx > 36.0386 )
									ret := -0.030664
							if( diPlus > 57.4431 )
								if( diMinus <= 17.7078 )
									ret := -0.240602
								if( diMinus > 17.7078 )
									ret := -0.614035
						if( smoothedDirectionalMovementPlus > 0.207196 )
							if( smoothedTrueRange <= 0.33792 )
								if( directionalMovementPlus <= 0.555699 )
									ret := -0.689024
								if( directionalMovementPlus > 0.555699 )
									ret := 0.230769
							if( smoothedTrueRange > 0.33792 )
								if( diPlus <= 51.6774 )
									ret := 0.228571
								if( diPlus > 51.6774 )
									ret := -0.320388
					if( directionalMovementPlus > 0.824639 )
						if( directionalMovementPlus <= 1.58936 )
							if( dx <= 77.8693 )
								if( dx <= 59.1975 )
									ret := -0.500000
								if( dx > 59.1975 )
									ret := -0.955556 // sell
							if( dx > 77.8693 )
								ret := -0.450000
						if( directionalMovementPlus > 1.58936 )
							if( diPlus <= 80.3714 )
								if( diPlus <= 71.973 )
									ret := -0.545455
								if( diPlus > 71.973 )
									ret := 0.500000
							if( diPlus > 80.3714 )
								ret := -0.785714 // sell
				if( smoothedTrueRange > 0.477072 )
					if( smoothedDirectionalMovementMinus <= 0.070322 )
						if( trueRange <= 2.4106 )
							if( smoothedDirectionalMovementPlus <= 0.158162 )
								if( adx <= 33.5993 )
									ret := 0.358974
								if( adx > 33.5993 )
									ret := -0.577181
							if( smoothedDirectionalMovementPlus > 0.158162 )
								if( diPlus <= 59.6819 )
									ret := -0.030814
								if( diPlus > 59.6819 )
									ret := -0.311111
						if( trueRange > 2.4106 )
							if( diMinus <= 6.15681 )
								ret := -0.777778 // sell
							if( diMinus > 6.15681 )
								ret := -1.000000 // sell
					if( smoothedDirectionalMovementMinus > 0.070322 )
						if( trueRange <= 0.300118 )
							if( dx <= 58.6238 )
								if( diPlus <= 61.6708 )
									ret := 0.000000
								if( diPlus > 61.6708 )
									ret := -0.857143 // sell
							if( dx > 58.6238 )
								if( adx <= 37.947 )
									ret := -0.305556
								if( adx > 37.947 )
									ret := 0.407407
						if( trueRange > 0.300118 )
							if( directionalMovementMinus <= 0.294229 )
								if( smoothedDirectionalMovementPlus <= 0.037607 )
									ret := -0.612100
								if( smoothedDirectionalMovementPlus > 0.037607 )
									ret := -0.371264
							if( directionalMovementMinus > 0.294229 )
								if( smoothedDirectionalMovementPlus <= 0.471344 )
									ret := -0.142045
								if( smoothedDirectionalMovementPlus > 0.471344 )
									ret := 0.290323
		if( diMinus > 51.5286 )
			if( dx <= 77.8033 )
				if( smoothedDirectionalMovementPlus <= 0.129909 )
					if( directionalMovementPlus <= 0.234326 )
						if( trueRange <= 0.408892 )
							if( dx <= 71.6082 )
								if( smoothedDirectionalMovementPlus <= 0.027089 )
									ret := -0.209790
								if( smoothedDirectionalMovementPlus > 0.027089 )
									ret := 0.146633
							if( dx > 71.6082 )
								if( diMinus <= 65.9053 )
									ret := -0.023810
								if( diMinus > 65.9053 )
									ret := 0.829787 // buy
						if( trueRange > 0.408892 )
							if( directionalMovementPlus <= 0.083926 )
								if( diPlus <= 25.1868 )
									ret := 0.224490
								if( diPlus > 25.1868 )
									ret := 0.594595
							if( directionalMovementPlus > 0.083926 )
								if( smoothedTrueRange <= 0.293549 )
									ret := -0.818182 // sell
								if( smoothedTrueRange > 0.293549 )
									ret := 0.384615
					if( directionalMovementPlus > 0.234326 )
						if( trueRange <= 0.673104 )
							if( smoothedTrueRange <= 0.162953 )
								ret := -0.187500
							if( smoothedTrueRange > 0.162953 )
								if( smoothedDirectionalMovementPlus <= 0.10207 )
									ret := 0.719008 // buy
								if( smoothedDirectionalMovementPlus > 0.10207 )
									ret := 0.294118
						if( trueRange > 0.673104 )
							ret := -0.400000
				if( smoothedDirectionalMovementPlus > 0.129909 )
					if( directionalMovementMinus <= 0.398737 )
						if( smoothedTrueRange <= 0.359152 )
							if( diPlus <= 44.8636 )
								if( directionalMovementMinus <= 0.21294 )
									ret := -0.896552 // sell
								if( directionalMovementMinus > 0.21294 )
									ret := -0.333333
							if( diPlus > 44.8636 )
								if( diPlus <= 46.7863 )
									ret := 0.444444
								if( diPlus > 46.7863 )
									ret := -0.400000
						if( smoothedTrueRange > 0.359152 )
							if( diMinus <= 52.6798 )
								ret := -0.230769
							if( diMinus > 52.6798 )
								ret := 0.500000
					if( directionalMovementMinus > 0.398737 )
						if( adx <= 15.5609 )
							ret := -0.176471
						if( adx > 15.5609 )
							if( smoothedDirectionalMovementPlus <= 0.139412 )
								ret := 0.687500
							if( smoothedDirectionalMovementPlus > 0.139412 )
								ret := 1.000000 // buy
			if( dx > 77.8033 )
				if( adx <= 66.6948 )
					if( directionalMovementMinus <= 0.116395 )
						if( smoothedDirectionalMovementMinus <= 0.09889 )
							ret := 0.000000
						if( smoothedDirectionalMovementMinus > 0.09889 )
							if( directionalMovementMinus <= 0.000336 )
								ret := -0.470588
							if( directionalMovementMinus > 0.000336 )
								if( directionalMovementMinus <= 0.074774 )
									ret := -0.977778 // sell
								if( directionalMovementMinus > 0.074774 )
									ret := -0.666667
					if( directionalMovementMinus > 0.116395 )
						if( diMinus <= 62.4611 )
							if( adx <= 50.4086 )
								ret := -0.105263
							if( adx > 50.4086 )
								if( smoothedDirectionalMovementPlus <= 0.013375 )
									ret := 0.153846
								if( smoothedDirectionalMovementPlus > 0.013375 )
									ret := 0.375000
						if( diMinus > 62.4611 )
							ret := -0.611111
				if( adx > 66.6948 )
					if( smoothedTrueRange <= 0.229735 )
						ret := 0.000000
					if( smoothedTrueRange > 0.229735 )
						if( dx <= 96.8094 )
							ret := 0.600000
						if( dx > 96.8094 )
							ret := 0.363636
	if( smoothedDirectionalMovementMinus > 0.199543 )
		if( diPlus <= 39.4589 )
			if( dx <= 80.97 )
				if( directionalMovementMinus <= 0.90005 )
					if( diMinus <= 47.8864 )
						if( adx <= 58.4885 )
							if( smoothedDirectionalMovementPlus <= 0.449505 )
								if( diMinus <= 18.5052 )
									ret := 0.363636
								if( diMinus > 18.5052 )
									ret := 0.030405
							if( smoothedDirectionalMovementPlus > 0.449505 )
								if( diMinus <= 11.9938 )
									ret := -0.361702
								if( diMinus > 11.9938 )
									ret := 0.346516
						if( adx > 58.4885 )
							if( directionalMovementMinus <= 0.207596 )
								if( directionalMovementMinus <= 0.023168 )
									ret := 0.248996
								if( directionalMovementMinus > 0.023168 )
									ret := 0.634021
							if( directionalMovementMinus > 0.207596 )
								if( adx <= 65.4805 )
									ret := -0.282609
								if( adx > 65.4805 )
									ret := 0.352518
					if( diMinus > 47.8864 )
						if( dx <= 68.7455 )
							if( smoothedTrueRange <= 0.638858 )
								if( diMinus <= 67.9773 )
									ret := 0.196817
								if( diMinus > 67.9773 )
									ret := 0.616580
							if( smoothedTrueRange > 0.638858 )
								if( diMinus <= 56.8709 )
									ret := 0.300000
								if( diMinus > 56.8709 )
									ret := -0.234375
						if( dx > 68.7455 )
							if( smoothedDirectionalMovementMinus <= 2.01006 )
								if( directionalMovementPlus <= 0.499973 )
									ret := 0.547893
								if( directionalMovementPlus > 0.499973 )
									ret := -0.307692
							if( smoothedDirectionalMovementMinus > 2.01006 )
								ret := -1.000000 // sell
				if( directionalMovementMinus > 0.90005 )
					if( trueRange <= 1.81357 )
						if( directionalMovementPlus <= 0.135259 )
							if( trueRange <= 1.79984 )
								if( diPlus <= 14.3143 )
									ret := 0.443966
								if( diPlus > 14.3143 )
									ret := 0.146608
							if( trueRange > 1.79984 )
								ret := -0.578947
						if( directionalMovementPlus > 0.135259 )
							ret := -0.473684
					if( trueRange > 1.81357 )
						if( smoothedDirectionalMovementPlus <= 0.182855 )
							if( diPlus <= 11.2119 )
								if( diMinus <= 43.7448 )
									ret := 0.600000
								if( diMinus > 43.7448 )
									ret := -0.217391
							if( diPlus > 11.2119 )
								if( diPlus <= 15.1791 )
									ret := 0.896000 // buy
								if( diPlus > 15.1791 )
									ret := 0.626263
						if( smoothedDirectionalMovementPlus > 0.182855 )
							if( diMinus <= 72.8854 )
								if( diPlus <= 15.2504 )
									ret := -0.818182 // sell
								if( diPlus > 15.2504 )
									ret := 0.369369
							if( diMinus > 72.8854 )
								ret := -0.800000 // sell
			if( dx > 80.97 )
				if( smoothedTrueRange <= 0.874871 )
					if( dx <= 82.2489 )
						if( trueRange <= 1.14355 )
							if( smoothedTrueRange <= 0.627068 )
								if( smoothedTrueRange <= 0.582336 )
									ret := -0.312500
								if( smoothedTrueRange > 0.582336 )
									ret := -1.000000 // sell
							if( smoothedTrueRange > 0.627068 )
								ret := 0.230769
						if( trueRange > 1.14355 )
							ret := -0.894737 // sell
					if( dx > 82.2489 )
						if( diMinus <= 45.6173 )
							if( directionalMovementMinus <= 0.371694 )
								if( adx <= 50.2592 )
									ret := 0.283582
								if( adx > 50.2592 )
									ret := -0.317881
							if( directionalMovementMinus > 0.371694 )
								if( adx <= 58.9457 )
									ret := -0.176471
								if( adx > 58.9457 )
									ret := 0.941176 // buy
						if( diMinus > 45.6173 )
							if( smoothedTrueRange <= 0.363671 )
								ret := -0.545455
							if( smoothedTrueRange > 0.363671 )
								if( trueRange <= 0.941912 )
									ret := 0.417085
								if( trueRange > 0.941912 )
									ret := -0.157895
				if( smoothedTrueRange > 0.874871 )
					if( trueRange <= 3.27995 )
						if( smoothedDirectionalMovementMinus <= 1.17846 )
							if( smoothedDirectionalMovementPlus <= 0.022831 )
								if( smoothedDirectionalMovementPlus <= 0.010907 )
									ret := -0.638889
								if( smoothedDirectionalMovementPlus > 0.010907 )
									ret := -0.974026 // sell
							if( smoothedDirectionalMovementPlus > 0.022831 )
								if( diMinus <= 39.0017 )
									ret := 0.656250
								if( diMinus > 39.0017 )
									ret := -0.396154
						if( smoothedDirectionalMovementMinus > 1.17846 )
							if( dx <= 93.5538 )
								ret := 0.722222 // buy
							if( dx > 93.5538 )
								ret := 1.000000 // buy
					if( trueRange > 3.27995 )
						if( smoothedDirectionalMovementMinus <= 1.14964 )
							if( diMinus <= 51.8528 )
								ret := 0.600000
							if( diMinus > 51.8528 )
								ret := -0.812500 // sell
						if( smoothedDirectionalMovementMinus > 1.14964 )
							if( directionalMovementMinus <= 0.599732 )
								ret := 0.500000
							if( directionalMovementMinus > 0.599732 )
								ret := 1.000000 // buy
		if( diPlus > 39.4589 )
			if( adx <= 12.9365 )
				if( dx <= 0.811223 )
					ret := -0.130435
				if( dx > 0.811223 )
					if( smoothedDirectionalMovementMinus <= 0.219862 )
						if( directionalMovementMinus <= 0.48105 )
							if( smoothedTrueRange <= 0.467261 )
								if( dx <= 6.68825 )
									ret := -0.266667
								if( dx > 6.68825 )
									ret := -0.833333 // sell
							if( smoothedTrueRange > 0.467261 )
								ret := 0.400000
						if( directionalMovementMinus > 0.48105 )
							ret := 0.555556
					if( smoothedDirectionalMovementMinus > 0.219862 )
						if( adx <= 12.2502 )
							if( diPlus <= 45.1065 )
								if( smoothedDirectionalMovementPlus <= 0.203256 )
									ret := -0.928571 // sell
								if( smoothedDirectionalMovementPlus > 0.203256 )
									ret := -1.000000 // sell
							if( diPlus > 45.1065 )
								if( dx <= 4.27897 )
									ret := -0.384615
								if( dx > 4.27897 )
									ret := -0.822581 // sell
						if( adx > 12.2502 )
							if( adx <= 12.4664 )
								ret := -0.428571
							if( adx > 12.4664 )
								ret := -0.812500 // sell
			if( adx > 12.9365 )
				if( smoothedDirectionalMovementMinus <= 0.234967 )
					if( smoothedTrueRange <= 1.08098 )
						if( smoothedTrueRange <= 0.383571 )
							if( diMinus <= 56 )
								ret := -0.933333 // sell
							if( diMinus > 56 )
								ret := -0.352941
						if( smoothedTrueRange > 0.383571 )
							if( diPlus <= 40.1647 )
								ret := -0.631579
							if( diPlus > 40.1647 )
								if( directionalMovementPlus <= 0.134084 )
									ret := 0.554770
								if( directionalMovementPlus > 0.134084 )
									ret := 0.086022
					if( smoothedTrueRange > 1.08098 )
						if( smoothedDirectionalMovementMinus <= 0.225819 )
							if( adx <= 35.1961 )
								ret := -0.238095
							if( adx > 35.1961 )
								if( dx <= 52.5852 )
									ret := -0.800000 // sell
								if( dx > 52.5852 )
									ret := -1.000000 // sell
						if( smoothedDirectionalMovementMinus > 0.225819 )
							ret := 0.142857
				if( smoothedDirectionalMovementMinus > 0.234967 )
					if( directionalMovementMinus <= 0.054517 )
						if( smoothedTrueRange <= 0.9109 )
							if( smoothedTrueRange <= 0.594416 )
								if( smoothedDirectionalMovementMinus <= 0.252098 )
									ret := -0.581818
								if( smoothedDirectionalMovementMinus > 0.252098 )
									ret := 0.224138
							if( smoothedTrueRange > 0.594416 )
								if( dx <= 14.5635 )
									ret := -0.705036 // sell
								if( dx > 14.5635 )
									ret := -0.171429
						if( smoothedTrueRange > 0.9109 )
							if( adx <= 51.495 )
								if( adx <= 45.3916 )
									ret := 0.087805
								if( adx > 45.3916 )
									ret := -1.000000 // sell
							if( adx > 51.495 )
								ret := 0.850000 // buy
					if( directionalMovementMinus > 0.054517 )
						if( smoothedDirectionalMovementMinus <= 0.474221 )
							if( smoothedDirectionalMovementPlus <= 0.23895 )
								if( dx <= 8.36086 )
									ret := 0.454545
								if( dx > 8.36086 )
									ret := 0.876923 // buy
							if( smoothedDirectionalMovementPlus > 0.23895 )
								if( dx <= 12.7327 )
									ret := -0.329787
								if( dx > 12.7327 )
									ret := 0.097778
						if( smoothedDirectionalMovementMinus > 0.474221 )
							if( diPlus <= 44.1319 )
								if( dx <= 13.9229 )
									ret := 0.875000 // buy
								if( dx > 13.9229 )
									ret := 1.000000 // buy
							if( diPlus > 44.1319 )
								ret := 0.437500
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator ADX_and_DI 
//@version=5
// This source code is subject to the terms of the Mozilla Public License 2.0 at https://mozilla.org/MPL/2.0/
// © BeikabuOyaji

//indicator "ADX and DI for v5", overlay=false)

// Input parameters
len = input(14, title="Length")
th = input(20, title="Threshold")

// Calculate True Range
trueRange = math.max(math.max(high - low, math.abs(high - nz(close[1]))), math.abs(low - nz(close[1])))

// Calculate Directional Movements
directionalMovementPlus = high - nz(high[1]) > nz(low[1]) - low ? math.max(high - nz(high[1]), 0) : 0
directionalMovementMinus = nz(low[1]) - low > high - nz(high[1]) ? math.max(nz(low[1]) - low, 0) : 0

// Initialize and calculate smoothed values
var float smoothedTrueRange = 0
var float smoothedDirectionalMovementPlus = 0
var float smoothedDirectionalMovementMinus = 0

smoothedTrueRange := nz(smoothedTrueRange[1]) - (nz(smoothedTrueRange[1]) / len) + trueRange
smoothedDirectionalMovementPlus := nz(smoothedDirectionalMovementPlus[1]) - (nz(smoothedDirectionalMovementPlus[1]) / len) + directionalMovementPlus
smoothedDirectionalMovementMinus := nz(smoothedDirectionalMovementMinus[1]) - (nz(smoothedDirectionalMovementMinus[1]) / len) + directionalMovementMinus

// Calculate DI+ and DI-
diPlus = (smoothedDirectionalMovementPlus / smoothedTrueRange) * 100
diMinus = (smoothedDirectionalMovementMinus / smoothedTrueRange) * 100

// Calculate DX and ADX
dx = math.abs(diPlus - diMinus) / (diPlus + diMinus) * 100
adx = ta.sma(dx, len)

// Plot DI+, DI-, and ADX
plot(diPlus, color=color.green, title="DI+")
plot(diMinus, color=color.red, title="DI-")
plot(adx, color=color.navy, title="ADX")

// Plot threshold line
hline(th, "Threshold", color=color.black)

// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_CRWD_1Min_50297a96(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


