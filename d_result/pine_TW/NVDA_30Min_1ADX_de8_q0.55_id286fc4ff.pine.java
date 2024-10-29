//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: NVDA_30Min_1ADX_286fc4ff Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_1ADX_286fc4ff", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_286fc4ff(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( dx <= 84.0502 )
		if( diMinus <= 17.0359 )
			if( smoothedTrueRange <= 9.55569 )
				if( smoothedDirectionalMovementPlus <= 0.332912 )
					if( smoothedDirectionalMovementMinus <= 0.07568 )
						if( smoothedTrueRange <= 0.48152 )
							if( adx <= 79.1316 )
								if( smoothedTrueRange <= 0.209143 )
									ret := 0.108659
								if( smoothedTrueRange > 0.209143 )
									ret := -0.054114
							if( adx > 79.1316 )
								if( smoothedDirectionalMovementPlus <= 0.159643 )
									ret := 0.035714
								if( smoothedDirectionalMovementPlus > 0.159643 )
									ret := 0.870968 // buy
						if( smoothedTrueRange > 0.48152 )
							if( diPlus <= 42.7015 )
								if( adx <= 89.7032 )
									ret := 0.052994
								if( adx > 89.7032 )
									ret := 1.000000 // buy
							if( diPlus > 42.7015 )
								if( smoothedDirectionalMovementPlus <= 0.238713 )
									ret := 0.712500 // buy
								if( smoothedDirectionalMovementPlus > 0.238713 )
									ret := 0.228659
					if( smoothedDirectionalMovementMinus > 0.07568 )
						if( smoothedTrueRange <= 0.578291 )
							if( smoothedTrueRange <= 0.523888 )
								if( diMinus <= 16.9243 )
									ret := -0.260870
								if( diMinus > 16.9243 )
									ret := 0.666667
							if( smoothedTrueRange > 0.523888 )
								if( trueRange <= 0.302378 )
									ret := -0.046875
								if( trueRange > 0.302378 )
									ret := 0.424051
						if( smoothedTrueRange > 0.578291 )
							if( adx <= 58.1051 )
								if( trueRange <= 0.991824 )
									ret := -0.030371
								if( trueRange > 0.991824 )
									ret := -0.112436
							if( adx > 58.1051 )
								if( diMinus <= 15.9802 )
									ret := -0.330667
								if( diMinus > 15.9802 )
									ret := 0.176471
				if( smoothedDirectionalMovementPlus > 0.332912 )
					if( diPlus <= 57.6648 )
						if( smoothedDirectionalMovementPlus <= 2.17295 )
							if( directionalMovementPlus <= 7.02782 )
								if( adx <= 54.2537 )
									ret := 0.038166
								if( adx > 54.2537 )
									ret := 0.115180
							if( directionalMovementPlus > 7.02782 )
								if( adx <= 54.8832 )
									ret := 0.620370
								if( adx > 54.8832 )
									ret := -0.500000
						if( smoothedDirectionalMovementPlus > 2.17295 )
							if( trueRange <= 8.14737 )
								if( diMinus <= 12.9245 )
									ret := -0.141975
								if( diMinus > 12.9245 )
									ret := 0.410714
							if( trueRange > 8.14737 )
								if( diPlus <= 42.4945 )
									ret := -0.117647
								if( diPlus > 42.4945 )
									ret := -0.808824 // sell
					if( diPlus > 57.6648 )
						if( dx <= 70.0169 )
							if( adx <= 45.2593 )
								if( diMinus <= 13.5303 )
									ret := -0.651163
								if( diMinus > 13.5303 )
									ret := 0.562500
							if( adx > 45.2593 )
								if( directionalMovementPlus <= 0.13 )
									ret := 0.363636
								if( directionalMovementPlus > 0.13 )
									ret := 1.000000 // buy
						if( dx > 70.0169 )
							if( dx <= 83.4123 )
								if( directionalMovementPlus <= 0.161133 )
									ret := 0.130435
								if( directionalMovementPlus > 0.161133 )
									ret := 0.766990 // buy
							if( dx > 83.4123 )
								ret := -0.384615
			if( smoothedTrueRange > 9.55569 )
				if( adx <= 22.0066 )
					ret := -0.400000
				if( adx > 22.0066 )
					if( adx <= 55.1416 )
						if( smoothedTrueRange <= 10.3227 )
							if( diMinus <= 13.4633 )
								if( smoothedDirectionalMovementMinus <= 1.03804 )
									ret := 0.833333 // buy
								if( smoothedDirectionalMovementMinus > 1.03804 )
									ret := 0.125000
							if( diMinus > 13.4633 )
								ret := 0.900000 // buy
						if( smoothedTrueRange > 10.3227 )
							if( dx <= 34.6088 )
								if( smoothedDirectionalMovementPlus <= 3.0768 )
									ret := 0.900000 // buy
								if( smoothedDirectionalMovementPlus > 3.0768 )
									ret := 1.000000 // buy
							if( dx > 34.6088 )
								if( directionalMovementPlus <= 3.13946 )
									ret := 0.592593
								if( directionalMovementPlus > 3.13946 )
									ret := 0.944444 // buy
					if( adx > 55.1416 )
						ret := 0.333333
		if( diMinus > 17.0359 )
			if( trueRange <= 0.425483 )
				if( dx <= 55.6724 )
					if( diPlus <= 18.8541 )
						if( adx <= 17.8032 )
							if( smoothedTrueRange <= 0.261864 )
								if( diMinus <= 22.9416 )
									ret := 0.000000
								if( diMinus > 22.9416 )
									ret := 0.781250 // buy
							if( smoothedTrueRange > 0.261864 )
								if( diMinus <= 27.9265 )
									ret := 0.232614
								if( diMinus > 27.9265 )
									ret := -0.068966
						if( adx > 17.8032 )
							if( smoothedDirectionalMovementPlus <= 0.024968 )
								if( directionalMovementMinus <= 0.072503 )
									ret := 0.161538
								if( directionalMovementMinus > 0.072503 )
									ret := 0.629032
							if( smoothedDirectionalMovementPlus > 0.024968 )
								if( directionalMovementPlus <= 0.004186 )
									ret := 0.011852
								if( directionalMovementPlus > 0.004186 )
									ret := 0.171472
					if( diPlus > 18.8541 )
						if( diMinus <= 42.8098 )
							if( dx <= 5.11435 )
								if( diPlus <= 35.2427 )
									ret := 0.061202
								if( diPlus > 35.2427 )
									ret := 0.512821
							if( dx > 5.11435 )
								if( diPlus <= 28.4913 )
									ret := -0.071464
								if( diPlus > 28.4913 )
									ret := 0.088599
						if( diMinus > 42.8098 )
							if( adx <= 37.8985 )
								if( smoothedDirectionalMovementPlus <= 0.093393 )
									ret := -0.217391
								if( smoothedDirectionalMovementPlus > 0.093393 )
									ret := 0.590909
							if( adx > 37.8985 )
								if( trueRange <= 0.178031 )
									ret := 0.000000
								if( trueRange > 0.178031 )
									ret := 0.644444
				if( dx > 55.6724 )
					if( smoothedDirectionalMovementMinus <= 1.278 )
						if( adx <= 79.7954 )
							if( directionalMovementMinus <= 0.002353 )
								if( smoothedDirectionalMovementMinus <= 0.266829 )
									ret := -0.120370
								if( smoothedDirectionalMovementMinus > 0.266829 )
									ret := 0.138643
							if( directionalMovementMinus > 0.002353 )
								if( directionalMovementPlus <= 0.02733 )
									ret := -0.135628
								if( directionalMovementPlus > 0.02733 )
									ret := -0.527273
						if( adx > 79.7954 )
							if( smoothedDirectionalMovementPlus <= 0.04725 )
								if( smoothedDirectionalMovementMinus <= 0.277471 )
									ret := -0.647059
								if( smoothedDirectionalMovementMinus > 0.277471 )
									ret := -1.000000 // sell
							if( smoothedDirectionalMovementPlus > 0.04725 )
								if( smoothedTrueRange <= 0.950132 )
									ret := -0.700000 // sell
								if( smoothedTrueRange > 0.950132 )
									ret := 0.000000
					if( smoothedDirectionalMovementMinus > 1.278 )
						if( diPlus <= 6.57659 )
							ret := 0.866667 // buy
						if( diPlus > 6.57659 )
							ret := 0.307692
			if( trueRange > 0.425483 )
				if( smoothedTrueRange <= 14.8036 )
					if( directionalMovementMinus <= 6.27413 )
						if( smoothedTrueRange <= 0.943499 )
							if( adx <= 32.9665 )
								if( smoothedTrueRange <= 0.890318 )
									ret := -0.097888
								if( smoothedTrueRange > 0.890318 )
									ret := 0.104803
							if( adx > 32.9665 )
								if( smoothedDirectionalMovementMinus <= 0.067903 )
									ret := -0.297436
								if( smoothedDirectionalMovementMinus > 0.067903 )
									ret := 0.072068
						if( smoothedTrueRange > 0.943499 )
							if( diPlus <= 25.713 )
								if( smoothedDirectionalMovementPlus <= 0.099322 )
									ret := -0.190240
								if( smoothedDirectionalMovementPlus > 0.099322 )
									ret := -0.026983
							if( diPlus > 25.713 )
								if( smoothedTrueRange <= 10.4132 )
									ret := -0.103801
								if( smoothedTrueRange > 10.4132 )
									ret := 0.634146
					if( directionalMovementMinus > 6.27413 )
						if( dx <= 14.2134 )
							if( adx <= 17.5713 )
								ret := -0.428571
							if( adx > 17.5713 )
								if( smoothedDirectionalMovementPlus <= 0.871454 )
									ret := 0.120000
								if( smoothedDirectionalMovementPlus > 0.871454 )
									ret := 0.648045
						if( dx > 14.2134 )
							if( adx <= 21.8271 )
								if( smoothedTrueRange <= 6.36344 )
									ret := -0.750000 // sell
								if( smoothedTrueRange > 6.36344 )
									ret := -0.238095
							if( adx > 21.8271 )
								if( smoothedDirectionalMovementMinus <= 0.87632 )
									ret := -0.296703
								if( smoothedDirectionalMovementMinus > 0.87632 )
									ret := 0.128713
				if( smoothedTrueRange > 14.8036 )
					if( diPlus <= 22.9143 )
						if( diPlus <= 17.3413 )
							if( diMinus <= 36.1775 )
								ret := -0.437500
							if( diMinus > 36.1775 )
								if( diMinus <= 38.949 )
									ret := -1.000000 // sell
								if( diMinus > 38.949 )
									ret := -0.800000 // sell
						if( diPlus > 17.3413 )
							ret := -1.000000 // sell
					if( diPlus > 22.9143 )
						ret := 0.333333
	if( dx > 84.0502 )
		if( directionalMovementPlus <= 0.007902 )
			if( smoothedTrueRange <= 1.91268 )
				if( adx <= 63.2078 )
					if( trueRange <= 1.56567 )
						if( directionalMovementMinus <= 0.360089 )
							if( smoothedDirectionalMovementPlus <= 0.002775 )
								if( diMinus <= 42.5288 )
									ret := 0.166667
								if( diMinus > 42.5288 )
									ret := 0.923077 // buy
							if( smoothedDirectionalMovementPlus > 0.002775 )
								if( smoothedDirectionalMovementMinus <= 0.025968 )
									ret := 0.093596
								if( smoothedDirectionalMovementMinus > 0.025968 )
									ret := -0.172749
						if( directionalMovementMinus > 0.360089 )
							if( smoothedTrueRange <= 0.81227 )
								if( diMinus <= 47.1171 )
									ret := -0.586207
								if( diMinus > 47.1171 )
									ret := 0.580645
							if( smoothedTrueRange > 0.81227 )
								if( smoothedDirectionalMovementPlus <= 0.038272 )
									ret := 0.512821
								if( smoothedDirectionalMovementPlus > 0.038272 )
									ret := 0.937500 // buy
					if( trueRange > 1.56567 )
						if( directionalMovementMinus <= 4.17184 )
							if( dx <= 87.9948 )
								if( smoothedTrueRange <= 1.05419 )
									ret := -0.142857
								if( smoothedTrueRange > 1.05419 )
									ret := 0.590909
							if( dx > 87.9948 )
								if( diPlus <= 2.34302 )
									ret := 0.839286 // buy
								if( diPlus > 2.34302 )
									ret := 0.384615
						if( directionalMovementMinus > 4.17184 )
							ret := -0.466667
				if( adx > 63.2078 )
					if( adx <= 73.0974 )
						if( diMinus <= 46.6544 )
							if( smoothedDirectionalMovementMinus <= 0.017655 )
								if( smoothedTrueRange <= 0.828731 )
									ret := 0.176471
								if( smoothedTrueRange > 0.828731 )
									ret := -0.200000
							if( smoothedDirectionalMovementMinus > 0.017655 )
								if( directionalMovementMinus <= 0.453081 )
									ret := -0.707071 // sell
								if( directionalMovementMinus > 0.453081 )
									ret := -0.333333
						if( diMinus > 46.6544 )
							if( trueRange <= 2.0564 )
								ret := -0.200000
							if( trueRange > 2.0564 )
								ret := 0.500000
					if( adx > 73.0974 )
						if( adx <= 75.3575 )
							if( trueRange <= 1.22332 )
								if( diPlus <= 2.22235 )
									ret := 0.600000
								if( diPlus > 2.22235 )
									ret := -0.125000
							if( trueRange > 1.22332 )
								ret := 1.000000 // buy
						if( adx > 75.3575 )
							if( diMinus <= 43.7201 )
								if( dx <= 89.7984 )
									ret := 0.342466
								if( dx > 89.7984 )
									ret := -0.220000
							if( diMinus > 43.7201 )
								if( smoothedTrueRange <= 1.26476 )
									ret := -0.078947
								if( smoothedTrueRange > 1.26476 )
									ret := -0.923077 // sell
			if( smoothedTrueRange > 1.91268 )
				if( dx <= 96.7866 )
					if( diMinus <= 48.4836 )
						if( dx <= 87.9358 )
							if( adx <= 43.9007 )
								if( diMinus <= 37.296 )
									ret := -0.133333
								if( diMinus > 37.296 )
									ret := 0.538462
							if( adx > 43.9007 )
								if( trueRange <= 4.065 )
									ret := 0.760563 // buy
								if( trueRange > 4.065 )
									ret := 0.076923
						if( dx > 87.9358 )
							if( dx <= 93.584 )
								if( trueRange <= 2.83 )
									ret := 0.320755
								if( trueRange > 2.83 )
									ret := -0.600000
							if( dx > 93.584 )
								if( dx <= 96.331 )
									ret := 0.672727
								if( dx > 96.331 )
									ret := 0.000000
					if( diMinus > 48.4836 )
						if( adx <= 73.9162 )
							if( smoothedTrueRange <= 4.02934 )
								if( smoothedDirectionalMovementMinus <= 1.86523 )
									ret := 0.519481
								if( smoothedDirectionalMovementMinus > 1.86523 )
									ret := 0.111111
							if( smoothedTrueRange > 4.02934 )
								if( smoothedDirectionalMovementPlus <= 0.161118 )
									ret := -0.708333 // sell
								if( smoothedDirectionalMovementPlus > 0.161118 )
									ret := -0.272727
						if( adx > 73.9162 )
							if( diMinus <= 54.1392 )
								if( diPlus <= 3.6135 )
									ret := -0.500000
								if( diPlus > 3.6135 )
									ret := -1.000000 // sell
							if( diMinus > 54.1392 )
								ret := 0.333333
				if( dx > 96.7866 )
					if( smoothedDirectionalMovementMinus <= 2.24661 )
						if( smoothedDirectionalMovementMinus <= 1.65956 )
							if( diPlus <= 0.499581 )
								ret := -0.882353 // sell
							if( diPlus > 0.499581 )
								if( smoothedDirectionalMovementPlus <= 1.33249 )
									ret := 0.200000
								if( smoothedDirectionalMovementPlus > 1.33249 )
									ret := -0.076923
						if( smoothedDirectionalMovementMinus > 1.65956 )
							ret := 0.700000 // buy
					if( smoothedDirectionalMovementMinus > 2.24661 )
						if( diMinus <= 97.2777 )
							if( adx <= 76.632 )
								ret := -0.636364
							if( adx > 76.632 )
								ret := -1.000000 // sell
						if( diMinus > 97.2777 )
							ret := 0.375000
		if( directionalMovementPlus > 0.007902 )
			if( smoothedDirectionalMovementPlus <= 0.251583 )
				if( dx <= 97.5397 )
					if( trueRange <= 3.4192 )
						if( directionalMovementPlus <= 0.422985 )
							if( diPlus <= 1.51439 )
								if( diMinus <= 46.0648 )
									ret := 0.476190
								if( diMinus > 46.0648 )
									ret := 1.000000 // buy
							if( diPlus > 1.51439 )
								if( dx <= 84.4949 )
									ret := 0.733333 // buy
								if( dx > 84.4949 )
									ret := 0.189266
						if( directionalMovementPlus > 0.422985 )
							if( adx <= 74.5484 )
								if( smoothedTrueRange <= 0.676964 )
									ret := 0.000000
								if( smoothedTrueRange > 0.676964 )
									ret := -0.657143
							if( adx > 74.5484 )
								ret := 0.800000 // buy
					if( trueRange > 3.4192 )
						if( adx <= 64.2541 )
							ret := -0.444444
						if( adx > 64.2541 )
							ret := -1.000000 // sell
				if( dx > 97.5397 )
					if( smoothedDirectionalMovementMinus <= 0.001114 )
						if( smoothedDirectionalMovementMinus <= 0.000165 )
							ret := -0.307692
						if( smoothedDirectionalMovementMinus > 0.000165 )
							ret := 0.083333
					if( smoothedDirectionalMovementMinus > 0.001114 )
						if( directionalMovementPlus <= 0.246135 )
							ret := -1.000000 // sell
						if( directionalMovementPlus > 0.246135 )
							ret := -0.600000
			if( smoothedDirectionalMovementPlus > 0.251583 )
				if( diPlus <= 55.5252 )
					if( smoothedTrueRange <= 1.38413 )
						if( smoothedDirectionalMovementPlus <= 0.529298 )
							if( directionalMovementPlus <= 0.52372 )
								if( diPlus <= 47.8233 )
									ret := 0.615702
								if( diPlus > 47.8233 )
									ret := 0.231884
							if( directionalMovementPlus > 0.52372 )
								if( smoothedDirectionalMovementMinus <= 0.011523 )
									ret := 0.416667
								if( smoothedDirectionalMovementMinus > 0.011523 )
									ret := -0.127660
						if( smoothedDirectionalMovementPlus > 0.529298 )
							if( adx <= 74.9819 )
								if( trueRange <= 1.0538 )
									ret := 0.666667
								if( trueRange > 1.0538 )
									ret := -0.181818
							if( adx > 74.9819 )
								ret := -0.529412
					if( smoothedTrueRange > 1.38413 )
						if( diMinus <= 1.32695 )
							if( smoothedTrueRange <= 1.76028 )
								if( smoothedDirectionalMovementMinus <= 0.012715 )
									ret := 0.500000
								if( smoothedDirectionalMovementMinus > 0.012715 )
									ret := 0.000000
							if( smoothedTrueRange > 1.76028 )
								if( smoothedTrueRange <= 5.45292 )
									ret := 0.745614 // buy
								if( smoothedTrueRange > 5.45292 )
									ret := 0.285714
						if( diMinus > 1.32695 )
							if( adx <= 28.1474 )
								if( trueRange <= 2.51483 )
									ret := 1.000000 // buy
								if( trueRange > 2.51483 )
									ret := 0.466667
							if( adx > 28.1474 )
								if( trueRange <= 0.792905 )
									ret := 0.711111 // buy
								if( trueRange > 0.792905 )
									ret := -0.170807
				if( diPlus > 55.5252 )
					if( dx <= 94.5341 )
						if( diPlus <= 68.1098 )
							if( diPlus <= 57.0418 )
								if( adx <= 59.6647 )
									ret := 0.636364
								if( adx > 59.6647 )
									ret := -0.076923
							if( diPlus > 57.0418 )
								if( adx <= 60.7726 )
									ret := 0.403846
								if( adx > 60.7726 )
									ret := 0.945205 // buy
						if( diPlus > 68.1098 )
							if( dx <= 89.203 )
								ret := -0.200000
							if( dx > 89.203 )
								ret := 0.416667
					if( dx > 94.5341 )
						if( diMinus <= 1.49835 )
							if( smoothedDirectionalMovementPlus <= 1.43107 )
								if( smoothedDirectionalMovementPlus <= 1.13444 )
									ret := 0.514851
								if( smoothedDirectionalMovementPlus > 1.13444 )
									ret := 1.000000 // buy
							if( smoothedDirectionalMovementPlus > 1.43107 )
								ret := -0.333333
						if( diMinus > 1.49835 )
							if( diPlus <= 65.4659 )
								ret := -1.000000 // sell
							if( diPlus > 65.4659 )
								ret := -0.250000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_NVDA_30Min_286fc4ff(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)

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


