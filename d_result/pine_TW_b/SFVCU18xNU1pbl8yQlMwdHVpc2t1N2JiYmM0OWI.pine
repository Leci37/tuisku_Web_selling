//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: HUBS_15Min_2BS0_7bbbc49b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_HUBS_15Min_2BS0_7bbbc49b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_HUBS_15Min_7bbbc49b(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bbp <= 11.052 )
		if( d_k <= -0.682559 )
			if( bearPower <= 0.309193 )
				if( bbm <= 2.99392 )
					if( smoothK_k <= 25.5855 )
						if( rsi1 <= 52.5311 )
							if( d <= 22.327 )
								if( bbp <= -1.0038 )
									ret := -0.151497
								if( bbp > -1.0038 )
									ret := -0.037904
							if( d > 22.327 )
								if( d_k <= -1.80026 )
									ret := -0.288660
								if( d_k > -1.80026 )
									ret := -0.571429
						if( rsi1 > 52.5311 )
							if( rsi1 <= 60.15 )
								if( bearPower <= 0.042602 )
									ret := 0.232653
								if( bearPower > 0.042602 )
									ret := -0.056075
							if( rsi1 > 60.15 )
								if( d <= 16.6295 )
									ret := -0.250000
								if( d > 16.6295 )
									ret := 0.206897
					if( smoothK_k > 25.5855 )
						if( d <= 21.3233 )
							if( bullPower <= 0.903044 )
								if( smoothK_k <= 32.6782 )
									ret := 0.310139
								if( smoothK_k > 32.6782 )
									ret := -0.060000
							if( bullPower > 0.903044 )
								if( rsi1 <= 58.4076 )
									ret := 0.031915
								if( rsi1 > 58.4076 )
									ret := -0.615385
						if( d > 21.3233 )
							if( bbm <= 0.252803 )
								if( k <= 87.4666 )
									ret := 0.110613
								if( k > 87.4666 )
									ret := -0.074534
							if( bbm > 0.252803 )
								if( bullPower <= -5.01078 )
									ret := -0.652778
								if( bullPower > -5.01078 )
									ret := -0.054696
				if( bbm > 2.99392 )
					if( rsi1 <= 25.0672 )
						if( smoothD_d <= -0.52444 )
							if( bbm <= 8.33635 )
								if( smoothK_k <= 0.395926 )
									ret := 0.026316
								if( smoothK_k > 0.395926 )
									ret := -0.736842 // sell
							if( bbm > 8.33635 )
								ret := 0.437500
						if( smoothD_d > -0.52444 )
							if( bbm <= 10.5124 )
								if( k <= 10.4556 )
									ret := 0.160000
								if( k > 10.4556 )
									ret := 0.411940
							if( bbm > 10.5124 )
								if( rsi1 <= 18.837 )
									ret := 0.800000 // buy
								if( rsi1 > 18.837 )
									ret := 1.000000 // buy
					if( rsi1 > 25.0672 )
						if( smoothK_k <= 44.6732 )
							if( smoothD_d <= 24.8725 )
								if( BBPower_Color <= 0.5 )
									ret := -0.103523
								if( BBPower_Color > 0.5 )
									ret := 0.154696
							if( smoothD_d > 24.8725 )
								if( k <= 33.4232 )
									ret := -0.774194 // sell
								if( k > 33.4232 )
									ret := -0.218085
						if( smoothK_k > 44.6732 )
							if( smoothK_k <= 48.7006 )
								if( bearPower <= -2.61174 )
									ret := 0.619565
								if( bearPower > -2.61174 )
									ret := 0.375000
							if( smoothK_k > 48.7006 )
								if( bearPower <= -0.952649 )
									ret := 0.120726
								if( bearPower > -0.952649 )
									ret := -0.154599
			if( bearPower > 0.309193 )
				if( smoothK_k <= 39.6262 )
					if( d <= 5.56642 )
						if( bbm <= 2.38718 )
							if( rsi1 <= 51.017 )
								if( d <= 3.85005 )
									ret := 0.000000
								if( d > 3.85005 )
									ret := 0.428571
							if( rsi1 > 51.017 )
								if( d_k <= -1.33556 )
									ret := -0.266667
								if( d_k > -1.33556 )
									ret := -0.714286 // sell
						if( bbm > 2.38718 )
							ret := 0.611111
					if( d > 5.56642 )
						if( d_k <= -21.0166 )
							if( bearPower <= 1.16809 )
								ret := 0.750000 // buy
							if( bearPower > 1.16809 )
								ret := 1.000000 // buy
						if( d_k > -21.0166 )
							if( smoothK_k <= 11.956 )
								if( bearPower <= 1.07071 )
									ret := 0.149123
								if( bearPower > 1.07071 )
									ret := 0.629630
							if( smoothK_k > 11.956 )
								if( rsi1 <= 66.0479 )
									ret := 0.148583
								if( rsi1 > 66.0479 )
									ret := -0.203448
				if( smoothK_k > 39.6262 )
					if( d_k <= -18.3984 )
						if( d <= 20.8875 )
							ret := -1.000000 // sell
						if( d > 20.8875 )
							if( d <= 40.8707 )
								if( smoothK_k <= 64.281 )
									ret := 0.082437
								if( smoothK_k > 64.281 )
									ret := -0.738095 // sell
							if( d > 40.8707 )
								if( bbp <= 5.78101 )
									ret := 0.065663
								if( bbp > 5.78101 )
									ret := 0.303116
					if( d_k > -18.3984 )
						if( smoothK_k <= 75.4675 )
							if( d_k <= -8.86267 )
								if( bullPower <= 3.52105 )
									ret := -0.136076
								if( bullPower > 3.52105 )
									ret := -0.365132
							if( d_k > -8.86267 )
								if( smoothD_d <= 68.0209 )
									ret := 0.055944
								if( smoothD_d > 68.0209 )
									ret := -0.580000
						if( smoothK_k > 75.4675 )
							if( bbm <= 0.9725 )
								if( d_k <= -9.07696 )
									ret := -0.049236
								if( d_k > -9.07696 )
									ret := 0.196581
							if( bbm > 0.9725 )
								if( bearPower <= 3.17929 )
									ret := -0.051862
								if( bearPower > 3.17929 )
									ret := -0.262500
		if( d_k > -0.682559 )
			if( bbp <= 0.827399 )
				if( smoothD_d <= 68.829 )
					if( bbp <= -4.9839 )
						if( bbm <= 0.755738 )
							if( d <= 10.9287 )
								if( smoothD_d <= 4.46736 )
									ret := 0.395062
								if( smoothD_d > 4.46736 )
									ret := 0.913793 // buy
							if( d > 10.9287 )
								if( bbp <= -13.26 )
									ret := 0.482759
								if( bbp > -13.26 )
									ret := -0.090379
						if( bbm > 0.755738 )
							if( bbp <= -41.8258 )
								if( smoothD_d <= 26.6486 )
									ret := 0.666667
								if( smoothD_d > 26.6486 )
									ret := -0.062500
							if( bbp > -41.8258 )
								if( smoothD_d <= -2.55357 )
									ret := 0.140625
								if( smoothD_d > -2.55357 )
									ret := -0.101026
					if( bbp > -4.9839 )
						if( d <= 68.9149 )
							if( rsi1 <= 48.8753 )
								if( d_k <= 29.1382 )
									ret := 0.038278
								if( d_k > 29.1382 )
									ret := 0.371585
							if( rsi1 > 48.8753 )
								if( bbp <= -0.323643 )
									ret := 0.217166
								if( bbp > -0.323643 )
									ret := 0.031723
						if( d > 68.9149 )
							if( bbp <= 0.021613 )
								if( bearPower <= -1.12507 )
									ret := -0.078704
								if( bearPower > -1.12507 )
									ret := -0.381395
							if( bbp > 0.021613 )
								if( bearPower <= -0.528666 )
									ret := -0.285714
								if( bearPower > -0.528666 )
									ret := 0.283186
				if( smoothD_d > 68.829 )
					if( smoothK_k <= 59.9574 )
						if( bullPower <= 2.01621 )
							if( smoothK_k <= 58.4143 )
								if( bullPower <= -0.073895 )
									ret := 0.484496
								if( bullPower > -0.073895 )
									ret := 0.194103
							if( smoothK_k > 58.4143 )
								if( rsi1 <= 47.4091 )
									ret := 0.354430
								if( rsi1 > 47.4091 )
									ret := 0.745283 // buy
						if( bullPower > 2.01621 )
							if( bearPower <= -8.14095 )
								ret := -0.230769
							if( bearPower > -8.14095 )
								if( bearPower <= -4.6371 )
									ret := -0.600000
								if( bearPower > -4.6371 )
									ret := -0.812500 // sell
					if( smoothK_k > 59.9574 )
						if( d_k <= 1.82482 )
							if( d <= 80.5815 )
								if( rsi1 <= 41.7277 )
									ret := -0.382353
								if( rsi1 > 41.7277 )
									ret := 0.066986
							if( d > 80.5815 )
								if( bullPower <= -0.055433 )
									ret := 0.537764
								if( bullPower > -0.055433 )
									ret := 0.171642
						if( d_k > 1.82482 )
							if( bbm <= 0.730756 )
								if( smoothD_d <= 72.9834 )
									ret := 0.254237
								if( smoothD_d > 72.9834 )
									ret := -0.026482
							if( bbm > 0.730756 )
								if( rsi1 <= 42.1531 )
									ret := -0.055891
								if( rsi1 > 42.1531 )
									ret := 0.141538
			if( bbp > 0.827399 )
				if( rsi1 <= 69.4808 )
					if( d <= 99.146 )
						if( d <= 1.25113 )
							if( k <= 0.039001 )
								if( d <= 0.006125 )
									ret := -0.111111
								if( d > 0.006125 )
									ret := -0.250000
							if( k > 0.039001 )
								if( smoothK_k <= -2.5985 )
									ret := -0.956522 // sell
								if( smoothK_k > -2.5985 )
									ret := -0.681818
						if( d > 1.25113 )
							if( bbm <= 2.02087 )
								if( rsi1 <= 50.3113 )
									ret := 0.110280
								if( rsi1 > 50.3113 )
									ret := -0.041687
							if( bbm > 2.02087 )
								if( smoothK_k <= 4.16179 )
									ret := 0.194570
								if( smoothK_k > 4.16179 )
									ret := -0.142114
					if( d > 99.146 )
						if( bbp <= 4.50155 )
							if( bullPower <= 1.72064 )
								if( bearPower <= 0.399812 )
									ret := -0.658537
								if( bearPower > 0.399812 )
									ret := -0.225806
							if( bullPower > 1.72064 )
								if( bbp <= 1.92952 )
									ret := -0.500000
								if( bbp > 1.92952 )
									ret := 0.177778
						if( bbp > 4.50155 )
							if( smoothK_k <= 96.6255 )
								if( smoothD_d <= 96.3778 )
									ret := -0.727273 // sell
								if( smoothD_d > 96.3778 )
									ret := -1.000000 // sell
							if( smoothK_k > 96.6255 )
								if( bullPower <= 6.05108 )
									ret := -0.431818
								if( bullPower > 6.05108 )
									ret := -0.928571 // sell
				if( rsi1 > 69.4808 )
					if( bbm <= 0.144668 )
						if( smoothK_k <= 43.2294 )
							ret := -0.650000
						if( smoothK_k > 43.2294 )
							if( bbp <= 3.71274 )
								if( bullPower <= 0.764028 )
									ret := 0.625000
								if( bullPower > 0.764028 )
									ret := -0.050633
							if( bbp > 3.71274 )
								if( bbp <= 7.1527 )
									ret := 0.750000 // buy
								if( bbp > 7.1527 )
									ret := 0.258065
					if( bbm > 0.144668 )
						if( bullPower <= 5.60557 )
							if( k <= 88.3422 )
								if( rsi1 <= 72.7758 )
									ret := 0.181818
								if( rsi1 > 72.7758 )
									ret := -0.007053
							if( k > 88.3422 )
								if( k <= 96.9169 )
									ret := -0.201525
								if( k > 96.9169 )
									ret := 0.080275
						if( bullPower > 5.60557 )
							if( smoothK_k <= 32.5403 )
								if( bearPower <= 3.61074 )
									ret := -0.771429 // sell
								if( bearPower > 3.61074 )
									ret := 0.692308
							if( smoothK_k > 32.5403 )
								if( smoothD_d <= 74.8376 )
									ret := 0.568966
								if( smoothD_d > 74.8376 )
									ret := 0.213918
	if( bbp > 11.052 )
		if( d_k <= -19.3421 )
			if( smoothD_d <= 27.5122 )
				if( bullPower <= 10.343 )
					if( smoothK_k <= 43.9459 )
						ret := -0.375000
					if( smoothK_k > 43.9459 )
						ret := -0.818182 // sell
				if( bullPower > 10.343 )
					if( smoothD_d <= 24.4338 )
						ret := -0.909091 // sell
					if( smoothD_d > 24.4338 )
						ret := -0.666667
			if( smoothD_d > 27.5122 )
				if( d_k <= -20.7102 )
					if( rsi1 <= 74.4699 )
						if( bullPower <= 15.5107 )
							if( bearPower <= 2.82694 )
								if( bbp <= 11.7861 )
									ret := 0.500000
								if( bbp > 11.7861 )
									ret := -0.588235
							if( bearPower > 2.82694 )
								if( rsi1 <= 58.6487 )
									ret := 0.384615
								if( rsi1 > 58.6487 )
									ret := 0.073171
						if( bullPower > 15.5107 )
							ret := -0.692308
					if( rsi1 > 74.4699 )
						if( bullPower <= 9.87525 )
							if( bbp <= 11.4967 )
								ret := -0.454545
							if( bbp > 11.4967 )
								if( rsi1 <= 76.7538 )
									ret := -1.000000 // sell
								if( rsi1 > 76.7538 )
									ret := -0.900000 // sell
						if( bullPower > 9.87525 )
							if( smoothK_k <= 79.7376 )
								ret := 0.166667
							if( smoothK_k > 79.7376 )
								if( bullPower <= 13.4514 )
									ret := 0.111111
								if( bullPower > 13.4514 )
									ret := -0.900000 // sell
				if( d_k > -20.7102 )
					if( k <= 72.062 )
						ret := -0.888889 // sell
					if( k > 72.062 )
						if( smoothD_d <= 76.7883 )
							ret := -0.416667
						if( smoothD_d > 76.7883 )
							ret := -0.833333 // sell
		if( d_k > -19.3421 )
			if( k <= 39.1124 )
				if( smoothK_k <= 6.80786 )
					if( d_k <= 13.5328 )
						if( rsi1 <= 72.1378 )
							ret := 0.105263
						if( rsi1 > 72.1378 )
							ret := -0.857143 // sell
					if( d_k > 13.5328 )
						ret := 0.692308
				if( smoothK_k > 6.80786 )
					if( d_k <= -1.73766 )
						if( d <= 19.2456 )
							if( bbp <= 13.4351 )
								ret := 0.687500
							if( bbp > 13.4351 )
								if( bbm <= 3.95 )
									ret := -0.055556
								if( bbm > 3.95 )
									ret := -0.750000 // sell
						if( d > 19.2456 )
							if( smoothK_k <= 30.6178 )
								ret := -0.071429
							if( smoothK_k > 30.6178 )
								if( bearPower <= 3.30159 )
									ret := -0.684211
								if( bearPower > 3.30159 )
									ret := -1.000000 // sell
					if( d_k > -1.73766 )
						if( d <= 46.6508 )
							if( d_k <= 5.55716 )
								if( smoothK_k <= 24.3918 )
									ret := -0.866667 // sell
								if( smoothK_k > 24.3918 )
									ret := -1.000000 // sell
							if( d_k > 5.55716 )
								if( k <= 19.0032 )
									ret := -0.529412
								if( k > 19.0032 )
									ret := -0.923077 // sell
						if( d > 46.6508 )
							if( bearPower <= 4.42894 )
								ret := -0.866667 // sell
							if( bearPower > 4.42894 )
								ret := -0.272727
			if( k > 39.1124 )
				if( smoothD_d <= 82.5417 )
					if( bearPower <= 7.41576 )
						if( d_k <= -11.0891 )
							if( smoothK_k <= 44.395 )
								ret := 0.857143 // buy
							if( smoothK_k > 44.395 )
								if( d <= 78.3764 )
									ret := -0.540698
								if( d > 78.3764 )
									ret := 0.184615
						if( d_k > -11.0891 )
							if( smoothD_d <= 59.0436 )
								if( smoothD_d <= 57.1538 )
									ret := -0.376000
								if( smoothD_d > 57.1538 )
									ret := -0.857143 // sell
							if( smoothD_d > 59.0436 )
								if( k <= 82.2057 )
									ret := 0.104869
								if( k > 82.2057 )
									ret := 0.538462
					if( bearPower > 7.41576 )
						if( rsi1 <= 84.0904 )
							if( bbp <= 33.906 )
								if( bearPower <= 12.4748 )
									ret := 0.481865
								if( bearPower > 12.4748 )
									ret := -0.160000
							if( bbp > 33.906 )
								if( bullPower <= 23.1741 )
									ret := 0.979592 // buy
								if( bullPower > 23.1741 )
									ret := 0.522727
						if( rsi1 > 84.0904 )
							ret := -0.875000 // sell
				if( smoothD_d > 82.5417 )
					if( rsi1 <= 93.1229 )
						if( d_k <= 7.21585 )
							if( bearPower <= 6.93821 )
								if( smoothK_k <= 96.7132 )
									ret := -0.157419
								if( smoothK_k > 96.7132 )
									ret := 0.207207
							if( bearPower > 6.93821 )
								if( bbp <= 23.9525 )
									ret := -0.554779
								if( bbp > 23.9525 )
									ret := -0.251553
						if( d_k > 7.21585 )
							if( bullPower <= 14.9113 )
								if( smoothD_d <= 88.7249 )
									ret := -0.230769
								if( smoothD_d > 88.7249 )
									ret := 0.611111
							if( bullPower > 14.9113 )
								ret := 0.913043 // buy
					if( rsi1 > 93.1229 )
						if( bbp <= 23.5026 )
							if( smoothD_d <= 96.4329 )
								if( bbm <= 3.69688 )
									ret := 0.714286 // buy
								if( bbm > 3.69688 )
									ret := -0.416667
							if( smoothD_d > 96.4329 )
								if( bullPower <= 9.20048 )
									ret := 0.347826
								if( bullPower > 9.20048 )
									ret := -0.678571
						if( bbp > 23.5026 )
							if( d <= 99.9061 )
								if( bearPower <= 20.0994 )
									ret := 0.848485 // buy
								if( bearPower > 20.0994 )
									ret := -0.235294
							if( d > 99.9061 )
								ret := 0.846154 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_HUBS_15Min_7bbbc49b(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


