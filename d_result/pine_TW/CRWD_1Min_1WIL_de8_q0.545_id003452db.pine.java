//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: CRWD_1Min_1WIL_003452db Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_1Min_1WIL_003452db", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_1Min_003452db(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( wvf <= 0.727683 )
		if( Color_con1 <= -0.574723 )
			if( sDev <= 2.7008 )
				if( midLine <= 0.5597 )
					if( lowerBand <= -0.018295 )
						if( Color_con2 <= -1.4431 )
							if( midLine <= 0.551931 )
								if( lowerBand <= -0.149077 )
									ret := 0.375000
								if( lowerBand > -0.149077 )
									ret := -0.084746
							if( midLine > 0.551931 )
								ret := -0.666667
						if( Color_con2 > -1.4431 )
							if( midLine <= 0.129873 )
								if( midLine <= 0.125064 )
									ret := -0.062500
								if( midLine > 0.125064 )
									ret := 1.000000 // buy
							if( midLine > 0.129873 )
								if( wvf <= 0.480965 )
									ret := -0.080921
								if( wvf > 0.480965 )
									ret := -0.475806
					if( lowerBand > -0.018295 )
						if( lowerBand <= 0.126258 )
							if( Color_con2 <= -0.45285 )
								if( upperBand <= 0.716263 )
									ret := 0.168831
								if( upperBand > 0.716263 )
									ret := -0.355107
							if( Color_con2 > -0.45285 )
								if( Color_con1 <= -0.637842 )
									ret := 0.123506
								if( Color_con1 > -0.637842 )
									ret := -0.322476
						if( lowerBand > 0.126258 )
							if( sDev <= 0.283 )
								if( lowerBand <= 0.263809 )
									ret := -0.395349
								if( lowerBand > 0.263809 )
									ret := -1.000000 // sell
							if( sDev > 0.283 )
								if( wvf <= 0.264253 )
									ret := 0.120536
								if( wvf > 0.264253 )
									ret := -0.586207
				if( midLine > 0.5597 )
					if( Color_con2 <= -2.49233 )
						if( lowerBand <= -0.635367 )
							if( sDev <= 2.37232 )
								if( wvf <= 0.162978 )
									ret := 0.555556
								if( wvf > 0.162978 )
									ret := 0.901961 // buy
							if( sDev > 2.37232 )
								ret := 0.272727
						if( lowerBand > -0.635367 )
							if( midLine <= 0.713232 )
								if( wvf <= 0.421411 )
									ret := 0.117647
								if( wvf > 0.421411 )
									ret := 0.696970
							if( midLine > 0.713232 )
								if( Color_con2 <= -5.23473 )
									ret := 1.000000 // buy
								if( Color_con2 > -5.23473 )
									ret := -0.056075
					if( Color_con2 > -2.49233 )
						if( midLine <= 0.674738 )
							if( Color_con2 <= -1.59235 )
								if( Color_con2 <= -2.27018 )
									ret := -0.083333
								if( Color_con2 > -2.27018 )
									ret := 0.621622
							if( Color_con2 > -1.59235 )
								if( sDev <= 0.37276 )
									ret := 0.292793
								if( sDev > 0.37276 )
									ret := 0.028875
						if( midLine > 0.674738 )
							if( wvf <= 0.192612 )
								if( sDev <= 1.90663 )
									ret := 0.104384
								if( sDev > 1.90663 )
									ret := -0.842105 // sell
							if( wvf > 0.192612 )
								if( midLine <= 1.48594 )
									ret := -0.093757
								if( midLine > 1.48594 )
									ret := 0.253165
			if( sDev > 2.7008 )
				if( sDev <= 2.98909 )
					if( upperBand <= 5.29504 )
						ret := -1.000000 // sell
					if( upperBand > 5.29504 )
						ret := -0.769231 // sell
				if( sDev > 2.98909 )
					if( wvf <= 0.571995 )
						if( wvf <= 0.412623 )
							if( wvf <= 0.229321 )
								ret := -0.846154 // sell
							if( wvf > 0.229321 )
								ret := -1.000000 // sell
						if( wvf > 0.412623 )
							if( lowerBand <= -2.6547 )
								ret := -0.076923
							if( lowerBand > -2.6547 )
								if( sDev <= 4.27945 )
									ret := -0.555556
								if( sDev > 4.27945 )
									ret := -1.000000 // sell
					if( wvf > 0.571995 )
						if( Color_con2 <= -1.76745 )
							ret := 0.500000
						if( Color_con2 > -1.76745 )
							ret := 0.000000
		if( Color_con1 > -0.574723 )
			if( lowerBand <= -0.159324 )
				if( sDev <= 0.432979 )
					if( midLine <= 0.082513 )
						if( Color_con1 <= 0.239508 )
							if( lowerBand <= -0.23657 )
								ret := 0.230769
							if( lowerBand > -0.23657 )
								ret := 0.821429 // buy
						if( Color_con1 > 0.239508 )
							ret := 1.000000 // buy
					if( midLine > 0.082513 )
						if( wvf <= 0.092845 )
							if( wvf <= 0.037484 )
								if( wvf <= 0.002189 )
									ret := -0.327586
								if( wvf > 0.002189 )
									ret := 0.226415
							if( wvf > 0.037484 )
								if( sDev <= 0.327686 )
									ret := -0.034483
								if( sDev > 0.327686 )
									ret := -0.563380
						if( wvf > 0.092845 )
							if( wvf <= 0.705099 )
								if( sDev <= 0.410971 )
									ret := 0.249020
								if( sDev > 0.410971 )
									ret := 0.577889
							if( wvf > 0.705099 )
								ret := -1.000000 // sell
				if( sDev > 0.432979 )
					if( wvf <= 0.649452 )
						if( upperBand <= 1.034 )
							if( sDev <= 0.582658 )
								if( wvf <= 0.447375 )
									ret := 0.160000
								if( wvf > 0.447375 )
									ret := -0.047619
							if( sDev > 0.582658 )
								if( wvf <= 0.436624 )
									ret := 0.055556
								if( wvf > 0.436624 )
									ret := -0.476190
						if( upperBand > 1.034 )
							if( colInt <= 0.5 )
								if( midLine <= 0.426837 )
									ret := 0.941176 // buy
								if( midLine > 0.426837 )
									ret := 0.000000
							if( colInt > 0.5 )
								if( Color_con2 <= 0.093022 )
									ret := 0.777778 // buy
								if( Color_con2 > 0.093022 )
									ret := 1.000000 // buy
					if( wvf > 0.649452 )
						if( lowerBand <= -0.16711 )
							if( sDev <= 0.722072 )
								if( Color_con2 <= -0.016517 )
									ret := -0.536585
								if( Color_con2 > -0.016517 )
									ret := 0.157143
							if( sDev > 0.722072 )
								ret := -1.000000 // sell
						if( lowerBand > -0.16711 )
							if( colInt <= 0.5 )
								ret := -1.000000 // sell
							if( colInt > 0.5 )
								ret := -0.777778 // sell
			if( lowerBand > -0.159324 )
				if( midLine <= 0.277338 )
					if( sDev <= 0.173881 )
						if( midLine <= 0.121549 )
							if( Color_con2 <= -1.0899 )
								if( Color_con2 <= -1.1373 )
									ret := -0.150000
								if( Color_con2 > -1.1373 )
									ret := 0.810811 // buy
							if( Color_con2 > -1.0899 )
								if( midLine <= 0.019762 )
									ret := 0.714286 // buy
								if( midLine > 0.019762 )
									ret := -0.029735
						if( midLine > 0.121549 )
							if( sDev <= 0.134045 )
								if( Color_con2 <= -0.098287 )
									ret := -0.064447
								if( Color_con2 > -0.098287 )
									ret := 0.071655
							if( sDev > 0.134045 )
								if( wvf <= 0.278279 )
									ret := 0.099032
								if( wvf > 0.278279 )
									ret := -0.033531
					if( sDev > 0.173881 )
						if( Color_con2 <= 0.294608 )
							if( lowerBand <= -0.069068 )
								if( sDev <= 0.302876 )
									ret := -0.187077
								if( sDev > 0.302876 )
									ret := -0.037534
							if( lowerBand > -0.069068 )
								if( midLine <= 0.182896 )
									ret := 0.044733
								if( midLine > 0.182896 )
									ret := -0.070257
						if( Color_con2 > 0.294608 )
							if( midLine <= 0.225854 )
								if( Color_con1 <= 0.131954 )
									ret := 0.774648 // buy
								if( Color_con1 > 0.131954 )
									ret := 0.181818
							if( midLine > 0.225854 )
								if( Color_con2 <= 0.320872 )
									ret := 0.500000
								if( Color_con2 > 0.320872 )
									ret := -0.300000
				if( midLine > 0.277338 )
					if( Color_con2 <= -1.00106 )
						if( upperBand <= 0.927346 )
							if( Color_con2 <= -2.25488 )
								if( wvf <= 0.433764 )
									ret := 0.770833 // buy
								if( wvf > 0.433764 )
									ret := -0.536232
							if( Color_con2 > -2.25488 )
								if( wvf <= 0.570995 )
									ret := -0.092593
								if( wvf > 0.570995 )
									ret := -0.816327 // sell
						if( upperBand > 0.927346 )
							if( midLine <= 0.731592 )
								if( midLine <= 0.504739 )
									ret := 0.294118
								if( midLine > 0.504739 )
									ret := -0.757009 // sell
							if( midLine > 0.731592 )
								if( wvf <= 0.663753 )
									ret := 0.363636
								if( wvf > 0.663753 )
									ret := 1.000000 // buy
					if( Color_con2 > -1.00106 )
						if( Color_con2 <= -0.779814 )
							if( sDev <= 0.378721 )
								if( Color_con1 <= -0.522991 )
									ret := 0.119403
								if( Color_con1 > -0.522991 )
									ret := 0.488439
							if( sDev > 0.378721 )
								if( lowerBand <= 0.130952 )
									ret := -0.300752
								if( lowerBand > 0.130952 )
									ret := 0.571429
						if( Color_con2 > -0.779814 )
							if( Color_con2 <= -0.385885 )
								if( wvf <= 0.609887 )
									ret := -0.011996
								if( wvf > 0.609887 )
									ret := -0.335526
							if( Color_con2 > -0.385885 )
								if( wvf <= 0.104561 )
									ret := 0.283871
								if( wvf > 0.104561 )
									ret := 0.033416
	if( wvf > 0.727683 )
		if( Color_con2 <= -0.04463 )
			if( wvf <= 1.55608 )
				if( midLine <= 1.15179 )
					if( midLine <= 0.651693 )
						if( Color_con2 <= -1.23225 )
							if( midLine <= 0.514319 )
								ret := 0.083333
							if( midLine > 0.514319 )
								if( upperBand <= 1.14792 )
									ret := 0.875000 // buy
								if( upperBand > 1.14792 )
									ret := 0.250000
						if( Color_con2 > -1.23225 )
							if( Color_con2 <= -0.08665 )
								if( lowerBand <= 0.24072 )
									ret := -0.360825
								if( lowerBand > 0.24072 )
									ret := 0.372549
							if( Color_con2 > -0.08665 )
								if( wvf <= 0.863317 )
									ret := 0.476190
								if( wvf > 0.863317 )
									ret := -0.603175
					if( midLine > 0.651693 )
						if( wvf <= 1.48554 )
							if( upperBand <= 2.2931 )
								if( wvf <= 0.9763 )
									ret := 0.039133
								if( wvf > 0.9763 )
									ret := -0.201944
							if( upperBand > 2.2931 )
								if( midLine <= 1.01411 )
									ret := 1.000000 // buy
								if( midLine > 1.01411 )
									ret := 0.410256
						if( wvf > 1.48554 )
							if( wvf <= 1.51356 )
								ret := 1.000000 // buy
							if( wvf > 1.51356 )
								ret := 0.428571
				if( midLine > 1.15179 )
					if( midLine <= 1.48515 )
						if( upperBand <= 1.80919 )
							if( Color_con2 <= -0.76891 )
								if( lowerBand <= 0.757501 )
									ret := -0.727273 // sell
								if( lowerBand > 0.757501 )
									ret := -0.333333
							if( Color_con2 > -0.76891 )
								if( Color_con1 <= -0.79856 )
									ret := 0.792453 // buy
								if( Color_con1 > -0.79856 )
									ret := 0.113793
						if( upperBand > 1.80919 )
							if( midLine <= 1.32293 )
								if( Color_con2 <= -1.28637 )
									ret := -0.255319
								if( Color_con2 > -1.28637 )
									ret := 0.408228
							if( midLine > 1.32293 )
								if( Color_con1 <= -0.946757 )
									ret := 0.484663
								if( Color_con1 > -0.946757 )
									ret := 0.771084 // buy
					if( midLine > 1.48515 )
						if( sDev <= 1.96493 )
							if( Color_con1 <= -0.932314 )
								if( lowerBand <= 1.03308 )
									ret := -0.114713
								if( lowerBand > 1.03308 )
									ret := 0.241546
							if( Color_con1 > -0.932314 )
								if( Color_con2 <= -0.565861 )
									ret := -0.924528 // sell
								if( Color_con2 > -0.565861 )
									ret := -0.535714
						if( sDev > 1.96493 )
							if( upperBand <= 5.94088 )
								if( lowerBand <= -1.99732 )
									ret := -0.333333
								if( lowerBand > -1.99732 )
									ret := 0.757764 // buy
							if( upperBand > 5.94088 )
								if( Color_con1 <= -5.33654 )
									ret := 0.518519
								if( Color_con1 > -5.33654 )
									ret := -0.512821
			if( wvf > 1.55608 )
				if( Color_con1 <= -18.1418 )
					ret := 1.000000 // buy
				if( Color_con1 > -18.1418 )
					if( sDev <= 0.686224 )
						if( upperBand <= 2.50749 )
							if( Color_con2 <= -1.18191 )
								ret := -1.000000 // sell
							if( Color_con2 > -1.18191 )
								if( wvf <= 1.80979 )
									ret := -0.500000
								if( wvf > 1.80979 )
									ret := 0.257143
						if( upperBand > 2.50749 )
							if( Color_con2 <= -0.639539 )
								ret := -0.615385
							if( Color_con2 > -0.639539 )
								if( wvf <= 1.94121 )
									ret := 1.000000 // buy
								if( wvf > 1.94121 )
									ret := 0.775000 // buy
					if( sDev > 0.686224 )
						if( Color_con2 <= -10.9214 )
							if( lowerBand <= -0.005367 )
								ret := -1.000000 // sell
							if( lowerBand > -0.005367 )
								if( Color_con1 <= -0.306292 )
									ret := -0.954545 // sell
								if( Color_con1 > -0.306292 )
									ret := -0.857143 // sell
						if( Color_con2 > -10.9214 )
							if( Color_con1 <= -3.40229 )
								if( upperBand <= 7.37012 )
									ret := -0.605263
								if( upperBand > 7.37012 )
									ret := -0.877358 // sell
							if( Color_con1 > -3.40229 )
								if( Color_con2 <= -0.886924 )
									ret := -0.027108
								if( Color_con2 > -0.886924 )
									ret := -0.377329
		if( Color_con2 > -0.04463 )
			if( sDev <= 1.34646 )
				if( Color_con2 <= 0.799861 )
					if( upperBand <= 0.729658 )
						if( sDev <= 0.441645 )
							if( upperBand <= 0.684268 )
								if( Color_con1 <= 0.165157 )
									ret := 0.540541
								if( Color_con1 > 0.165157 )
									ret := -0.125926
							if( upperBand > 0.684268 )
								if( Color_con1 <= 0.053703 )
									ret := 0.178571
								if( Color_con1 > 0.053703 )
									ret := -0.515152
						if( sDev > 0.441645 )
							if( wvf <= 0.760682 )
								if( wvf <= 0.745719 )
									ret := -1.000000 // sell
								if( wvf > 0.745719 )
									ret := -0.833333 // sell
							if( wvf > 0.760682 )
								if( sDev <= 0.457209 )
									ret := 0.333333
								if( sDev > 0.457209 )
									ret := -0.117647
					if( upperBand > 0.729658 )
						if( lowerBand <= -0.60431 )
							if( upperBand <= 1.79088 )
								ret := -1.000000 // sell
							if( upperBand > 1.79088 )
								ret := -0.733333 // sell
						if( lowerBand > -0.60431 )
							if( Color_con1 <= 0.307177 )
								if( sDev <= 0.261425 )
									ret := -0.244898
								if( sDev > 0.261425 )
									ret := 0.153710
							if( Color_con1 > 0.307177 )
								if( Color_con1 <= 0.371532 )
									ret := -0.842105 // sell
								if( Color_con1 > 0.371532 )
									ret := 0.200000
				if( Color_con2 > 0.799861 )
					if( wvf <= 1.83809 )
						if( sDev <= 0.569594 )
							if( wvf <= 1.25312 )
								ret := 1.000000 // buy
							if( wvf > 1.25312 )
								ret := 0.666667
						if( sDev > 0.569594 )
							if( Color_con1 <= 0.265506 )
								if( upperBand <= 1.59839 )
									ret := 0.724324 // buy
								if( upperBand > 1.59839 )
									ret := 0.394231
							if( Color_con1 > 0.265506 )
								if( midLine <= 0.273714 )
									ret := 0.681818
								if( midLine > 0.273714 )
									ret := -0.056818
					if( wvf > 1.83809 )
						if( lowerBand <= 0.16647 )
							if( upperBand <= 1.8138 )
								if( upperBand <= 1.77373 )
									ret := 0.010989
								if( upperBand > 1.77373 )
									ret := -0.875000 // sell
							if( upperBand > 1.8138 )
								if( Color_con2 <= 1.17245 )
									ret := -0.236842
								if( Color_con2 > 1.17245 )
									ret := 0.608696
						if( lowerBand > 0.16647 )
							if( Color_con2 <= 0.975941 )
								ret := -0.333333
							if( Color_con2 > 0.975941 )
								ret := -0.920000 // sell
			if( sDev > 1.34646 )
				if( midLine <= 4.14858 )
					if( sDev <= 3.75561 )
						if( midLine <= 1.7858 )
							if( upperBand <= 2.00073 )
								if( Color_con1 <= 0.133102 )
									ret := -1.000000 // sell
								if( Color_con1 > 0.133102 )
									ret := -0.840000 // sell
							if( upperBand > 2.00073 )
								if( sDev <= 3.10612 )
									ret := 0.023946
								if( sDev > 3.10612 )
									ret := -0.974359 // sell
						if( midLine > 1.7858 )
							if( upperBand <= 4.78196 )
								if( upperBand <= 4.37201 )
									ret := -0.721519 // sell
								if( upperBand > 4.37201 )
									ret := -0.303030
							if( upperBand > 4.78196 )
								if( Color_con2 <= 1.01747 )
									ret := 0.558559
								if( Color_con2 > 1.01747 )
									ret := -0.735849 // sell
					if( sDev > 3.75561 )
						if( upperBand <= 11.5584 )
							if( Color_con2 <= 0.414027 )
								ret := 0.857143 // buy
							if( Color_con2 > 0.414027 )
								ret := 1.000000 // buy
						if( upperBand > 11.5584 )
							ret := -1.000000 // sell
				if( midLine > 4.14858 )
					if( sDev <= 13.2126 )
						if( midLine <= 4.92387 )
							ret := 0.666667
						if( midLine > 4.92387 )
							if( Color_con2 <= 0.140806 )
								ret := 0.777778 // buy
							if( Color_con2 > 0.140806 )
								ret := 1.000000 // buy
					if( sDev > 13.2126 )
						ret := 0.300000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Williams_Vix_Fix 
//@version=5
//indicator "CM_Williams_Vix_Fix", overlay=false)

// Inputs
pd = input.int(22, title="LookBack Period Standard Deviation High")
bbl = input.int(20, title="Bollinger Band Length")
mult = input.float(2.0, minval=1, maxval=5, title="Bollinger Band Standard Deviation Up")
lb = input.int(50, title="Look Back Period Percentile High")
ph = input.float(0.85, title="Highest Percentile - 0.90=90%, 0.95=95%, 0.99=99%")
pl = input.float(1.01, title="Lowest Percentile - 1.10=90%, 1.05=95%, 1.01=99%")
hp = input.bool(false, title="Show High Range - Based on Percentile and LookBack Period?")
sd = input.bool(false, title="Show Standard Deviation Line?")

// Calculations
wvf = ((ta.highest(close, pd) - low) / ta.highest(close, pd)) * 100

sDev = mult * ta.stdev(wvf, bbl)
midLine = ta.sma(wvf, bbl)
lowerBand = midLine - sDev
upperBand = midLine + sDev

rangeHigh = ta.highest(wvf, lb) * ph
rangeLow = ta.lowest(wvf, lb) * pl


Color_con1 = wvf - upperBand
Color_con2 = wvf - rangeHigh
// Color condition
col = wvf >= upperBand or wvf >= rangeHigh ? color.lime : color.gray
colInt = wvf >= upperBand or wvf >= rangeHigh ? 1 : 0 //Bool to int

// Plots
plot(hp and na(rangeHigh) ? na : rangeHigh, title="Range High Percentile", color=color.orange, linewidth=4)
plot(hp and na(rangeLow) ? na : rangeLow, title="Range Low Percentile", color=color.orange, linewidth=4)
plot(wvf, title="Williams Vix Fix", color=col, style=plot.style_histogram, linewidth=4)
plot(sd and na(upperBand) ? na : upperBand, title="Upper Band", color=color.aqua, linewidth=3)

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
float op_operation = decision_tree_0_CRWD_1Min_003452db(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)

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


