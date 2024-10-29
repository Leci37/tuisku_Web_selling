//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: HUBS_15Min_2CM0_7bc6b0ca Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_HUBS_15Min_2CM0_7bc6b0ca", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_HUBS_15Min_7bc6b0ca(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( MFI <= 49.4544 )
		if( Negative_Money_Flow_Sum <= 1.97636e+08 )
			if( Money_Flow_Ratio <= 0.443178 )
				if( Negative_Money_Flow_Sum <= 5.00392e+07 )
					if( ad <= -25152.6 )
						if( Typical_Price <= 363.445 )
							if( MFI_High <= -53.5454 )
								if( MFI <= 23.2208 )
									ret := 0.500000
								if( MFI > 23.2208 )
									ret := 0.151163
							if( MFI_High > -53.5454 )
								if( mf <= -0.081209 )
									ret := 0.684783
								if( mf > -0.081209 )
									ret := 0.090909
						if( Typical_Price > 363.445 )
							ret := -0.714286 // sell
					if( ad > -25152.6 )
						if( Negative_Money_Flow_Sum <= 2.75519e+06 )
							if( Raw_Money_Flow <= 568557 )
								ret := 0.772727 // buy
							if( Raw_Money_Flow > 568557 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 2.75519e+06 )
							if( Raw_Money_Flow <= 2.50709e+06 )
								if( Negative_Money_Flow <= 286274 )
									ret := 0.147804
								if( Negative_Money_Flow > 286274 )
									ret := -0.000517
							if( Raw_Money_Flow > 2.50709e+06 )
								if( Raw_Money_Flow <= 2.58069e+06 )
									ret := 0.655738
								if( Raw_Money_Flow > 2.58069e+06 )
									ret := 0.176203
				if( Negative_Money_Flow_Sum > 5.00392e+07 )
					if( Positive_Money_Flow_Sum <= 3.25307e+07 )
						if( mf <= -0.160816 )
							if( Negative_Money_Flow_Sum <= 1.89816e+08 )
								if( Negative_Money_Flow <= 2.19533e+07 )
									ret := 0.024056
								if( Negative_Money_Flow > 2.19533e+07 )
									ret := 0.341398
							if( Negative_Money_Flow_Sum > 1.89816e+08 )
								if( ad <= 531.537 )
									ret := 0.875000 // buy
								if( ad > 531.537 )
									ret := 0.363636
						if( mf > -0.160816 )
							if( Money_Flow_Ratio <= 0.282179 )
								if( Negative_Money_Flow_Sum <= 1.70394e+08 )
									ret := -0.154321
								if( Negative_Money_Flow_Sum > 1.70394e+08 )
									ret := 0.448276
							if( Money_Flow_Ratio > 0.282179 )
								if( ad_mf <= 124074 )
									ret := 0.030179
								if( ad_mf > 124074 )
									ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 3.25307e+07 )
						if( Raw_Money_Flow <= 1.18483e+07 )
							if( MFI <= 17.8042 )
								if( ad <= 7854.45 )
									ret := 0.866667 // buy
								if( ad > 7854.45 )
									ret := 0.222222
							if( MFI > 17.8042 )
								if( ad_mf <= 11557.7 )
									ret := 0.036364
								if( ad_mf > 11557.7 )
									ret := -0.342105
						if( Raw_Money_Flow > 1.18483e+07 )
							if( Money_Flow_Ratio <= 0.41072 )
								if( Negative_Money_Flow_Sum <= 1.19852e+08 )
									ret := -0.036697
								if( Negative_Money_Flow_Sum > 1.19852e+08 )
									ret := 0.254369
							if( Money_Flow_Ratio > 0.41072 )
								if( ad <= 14598.6 )
									ret := 0.697143
								if( ad > 14598.6 )
									ret := 0.210526
			if( Money_Flow_Ratio > 0.443178 )
				if( Negative_Money_Flow <= 2.15498e+07 )
					if( MFI_High <= -37.0686 )
						if( mf <= -0.049996 )
							if( Positive_Money_Flow_Sum <= 4.60074e+07 )
								if( Raw_Money_Flow <= 257089 )
									ret := -0.339768
								if( Raw_Money_Flow > 257089 )
									ret := 0.003594
							if( Positive_Money_Flow_Sum > 4.60074e+07 )
								if( Raw_Money_Flow <= 311808 )
									ret := 0.774648 // buy
								if( Raw_Money_Flow > 311808 )
									ret := 0.076171
						if( mf > -0.049996 )
							if( Positive_Money_Flow <= 6.40527e+06 )
								if( Raw_Money_Flow <= 6.71033e+06 )
									ret := -0.011643
								if( Raw_Money_Flow > 6.71033e+06 )
									ret := -0.176856
							if( Positive_Money_Flow > 6.40527e+06 )
								if( Positive_Money_Flow <= 2.2344e+07 )
									ret := -0.336245
								if( Positive_Money_Flow > 2.2344e+07 )
									ret := 0.430380
					if( MFI_High > -37.0686 )
						if( Negative_Money_Flow_Sum <= 2.13081e+07 )
							if( ad_mf <= -25968.7 )
								if( MFI_High <= -32.611 )
									ret := -0.405405
								if( MFI_High > -32.611 )
									ret := 0.857143 // buy
							if( ad_mf > -25968.7 )
								if( Negative_Money_Flow <= 6.04161e+06 )
									ret := -0.071375
								if( Negative_Money_Flow > 6.04161e+06 )
									ret := 0.679245
						if( Negative_Money_Flow_Sum > 2.13081e+07 )
							if( Raw_Money_Flow <= 40249.5 )
								if( Positive_Money_Flow_Sum <= 3.6982e+07 )
									ret := 0.950000 // buy
								if( Positive_Money_Flow_Sum > 3.6982e+07 )
									ret := 0.111111
							if( Raw_Money_Flow > 40249.5 )
								if( ad_mf <= -17269.3 )
									ret := -0.047096
								if( ad_mf > -17269.3 )
									ret := 0.094075
				if( Negative_Money_Flow > 2.15498e+07 )
					if( Raw_Money_Flow <= 7.12354e+07 )
						if( Typical_Price <= 269.676 )
							if( MFI_High <= -38.8847 )
								ret := 1.000000 // buy
							if( MFI_High > -38.8847 )
								ret := 0.727273 // buy
						if( Typical_Price > 269.676 )
							if( MFI_Low <= 24.1935 )
								if( MFI <= 43.4225 )
									ret := 0.172117
								if( MFI > 43.4225 )
									ret := -0.593750
							if( MFI_Low > 24.1935 )
								if( Raw_Money_Flow <= 3.20684e+07 )
									ret := 0.296053
								if( Raw_Money_Flow > 3.20684e+07 )
									ret := 0.563380
					if( Raw_Money_Flow > 7.12354e+07 )
						if( Raw_Money_Flow <= 7.70239e+07 )
							ret := 1.000000 // buy
						if( Raw_Money_Flow > 7.70239e+07 )
							if( ad_mf <= -24103.5 )
								ret := 1.000000 // buy
							if( ad_mf > -24103.5 )
								ret := 0.000000
		if( Negative_Money_Flow_Sum > 1.97636e+08 )
			if( Typical_Price <= 775.771 )
				if( Money_Flow_Ratio <= 0.621073 )
					if( Typical_Price <= 568.666 )
						if( Positive_Money_Flow <= 127946 )
							if( Money_Flow_Ratio <= 0.56708 )
								if( MFI <= 14.9965 )
									ret := 0.067039
								if( MFI > 14.9965 )
									ret := -0.179856
							if( Money_Flow_Ratio > 0.56708 )
								if( ad_mf <= -23207.6 )
									ret := -0.100000
								if( ad_mf > -23207.6 )
									ret := 0.931818 // buy
						if( Positive_Money_Flow > 127946 )
							if( ad_mf <= -25897.9 )
								ret := 0.611111
							if( ad_mf > -25897.9 )
								if( Negative_Money_Flow_Sum <= 2.53357e+08 )
									ret := -0.337500
								if( Negative_Money_Flow_Sum > 2.53357e+08 )
									ret := -0.725146 // sell
					if( Typical_Price > 568.666 )
						if( MFI_High <= -64.1321 )
							if( Positive_Money_Flow <= 1.05064e+07 )
								if( MFI <= 7.75175 )
									ret := 0.000000
								if( MFI > 7.75175 )
									ret := 0.653061
							if( Positive_Money_Flow > 1.05064e+07 )
								if( Negative_Money_Flow_Sum <= 2.9029e+08 )
									ret := -0.933333 // sell
								if( Negative_Money_Flow_Sum > 2.9029e+08 )
									ret := 0.375000
						if( MFI_High > -64.1321 )
							if( Positive_Money_Flow_Sum <= 5.64205e+07 )
								if( Negative_Money_Flow <= 3.0625e+07 )
									ret := -0.818182 // sell
								if( Negative_Money_Flow > 3.0625e+07 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 5.64205e+07 )
								if( MFI_Low <= 5.72405 )
									ret := -0.257143
								if( MFI_Low > 5.72405 )
									ret := 0.481481
				if( Money_Flow_Ratio > 0.621073 )
					if( MFI <= 44.0785 )
						if( ad_mf <= 30739.7 )
							if( Raw_Money_Flow <= 1.45924e+07 )
								ret := 0.071429
							if( Raw_Money_Flow > 1.45924e+07 )
								if( Typical_Price <= 503.371 )
									ret := -0.708333 // sell
								if( Typical_Price > 503.371 )
									ret := -0.980769 // sell
						if( ad_mf > 30739.7 )
							ret := 0.500000
					if( MFI > 44.0785 )
						if( ad_mf <= 161.419 )
							if( MFI_Low <= 25.1785 )
								ret := 0.533333
							if( MFI_Low > 25.1785 )
								ret := -0.368421
						if( ad_mf > 161.419 )
							if( Raw_Money_Flow <= 4.48076e+07 )
								ret := -0.461538
							if( Raw_Money_Flow > 4.48076e+07 )
								ret := -1.000000 // sell
			if( Typical_Price > 775.771 )
				if( ad_mf <= -4549.94 )
					if( MFI_Low <= 12.1323 )
						ret := -0.500000
					if( MFI_Low > 12.1323 )
						ret := -0.666667
				if( ad_mf > -4549.94 )
					if( Positive_Money_Flow_Sum <= 1.04185e+08 )
						if( Negative_Money_Flow_Sum <= 2.86444e+08 )
							ret := -0.888889 // sell
						if( Negative_Money_Flow_Sum > 2.86444e+08 )
							ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 1.04185e+08 )
						ret := -0.555556
	if( MFI > 49.4544 )
		if( Money_Flow_Ratio <= 39.7233 )
			if( Typical_Price <= 359.255 )
				if( ad <= 32.5176 )
					if( mf <= -0.292754 )
						if( MFI <= 79.6131 )
							if( MFI_Low <= 44.6772 )
								if( mf <= -0.440504 )
									ret := 0.210526
								if( mf > -0.440504 )
									ret := -0.540230
							if( MFI_Low > 44.6772 )
								if( Negative_Money_Flow_Sum <= 6.26952e+06 )
									ret := 0.529412
								if( Negative_Money_Flow_Sum > 6.26952e+06 )
									ret := -0.147059
						if( MFI > 79.6131 )
							if( Positive_Money_Flow_Sum <= 6.66437e+07 )
								ret := -0.750000 // sell
							if( Positive_Money_Flow_Sum > 6.66437e+07 )
								ret := -1.000000 // sell
					if( mf > -0.292754 )
						if( MFI_Low <= 30.9124 )
							if( MFI_High <= -29.9011 )
								if( MFI_High <= -30.1341 )
									ret := -0.064171
								if( MFI_High > -30.1341 )
									ret := 0.198020
							if( MFI_High > -29.9011 )
								if( ad <= -1758.36 )
									ret := -0.316206
								if( ad > -1758.36 )
									ret := 0.113208
						if( MFI_Low > 30.9124 )
							if( MFI_Low <= 33.1015 )
								if( Negative_Money_Flow_Sum <= 4.38142e+06 )
									ret := -0.337662
								if( Negative_Money_Flow_Sum > 4.38142e+06 )
									ret := 0.237027
							if( MFI_Low > 33.1015 )
								if( Negative_Money_Flow <= 1.27698e+06 )
									ret := 0.070256
								if( Negative_Money_Flow > 1.27698e+06 )
									ret := -0.043412
				if( ad > 32.5176 )
					if( Raw_Money_Flow <= 2.92344e+06 )
						if( Money_Flow_Ratio <= 1.1372 )
							if( mf <= -0.02665 )
								if( Negative_Money_Flow_Sum <= 1.43653e+07 )
									ret := -0.241830
								if( Negative_Money_Flow_Sum > 1.43653e+07 )
									ret := 0.258993
							if( mf > -0.02665 )
								if( ad <= 3706.5 )
									ret := -0.035714
								if( ad > 3706.5 )
									ret := -0.359195
						if( Money_Flow_Ratio > 1.1372 )
							if( Money_Flow_Ratio <= 1.92036 )
								if( Negative_Money_Flow_Sum <= 1.24857e+06 )
									ret := -0.722222 // sell
								if( Negative_Money_Flow_Sum > 1.24857e+06 )
									ret := 0.096452
							if( Money_Flow_Ratio > 1.92036 )
								if( MFI_High <= -10.1799 )
									ret := -0.192814
								if( MFI_High > -10.1799 )
									ret := 0.004190
					if( Raw_Money_Flow > 2.92344e+06 )
						if( Positive_Money_Flow <= 5.11356e+06 )
							if( Positive_Money_Flow_Sum <= 1.36711e+07 )
								if( mf <= 0.124984 )
									ret := 0.407407
								if( mf > 0.124984 )
									ret := -0.058824
							if( Positive_Money_Flow_Sum > 1.36711e+07 )
								if( Money_Flow_Ratio <= 3.70619 )
									ret := -0.141945
								if( Money_Flow_Ratio > 3.70619 )
									ret := -0.411765
						if( Positive_Money_Flow > 5.11356e+06 )
							if( MFI <= 89.0686 )
								if( Negative_Money_Flow_Sum <= 1.74776e+07 )
									ret := -0.171728
								if( Negative_Money_Flow_Sum > 1.74776e+07 )
									ret := 0.020673
							if( MFI > 89.0686 )
								if( MFI_Low <= 74.5979 )
									ret := 0.591463
								if( MFI_Low > 74.5979 )
									ret := -0.285714
			if( Typical_Price > 359.255 )
				if( Raw_Money_Flow <= 296239 )
					if( ad <= -42.3013 )
						if( Positive_Money_Flow_Sum <= 5.31694e+07 )
							ret := -0.333333
						if( Positive_Money_Flow_Sum > 5.31694e+07 )
							if( Positive_Money_Flow_Sum <= 8.39683e+07 )
								if( Typical_Price <= 486.41 )
									ret := 1.000000 // buy
								if( Typical_Price > 486.41 )
									ret := 0.769231 // buy
							if( Positive_Money_Flow_Sum > 8.39683e+07 )
								if( ad <= -388.699 )
									ret := -0.166667
								if( ad > -388.699 )
									ret := 0.733333 // buy
					if( ad > -42.3013 )
						if( Typical_Price <= 505.638 )
							if( ad_mf <= -0.4684 )
								ret := -0.750000 // sell
							if( ad_mf > -0.4684 )
								if( Raw_Money_Flow <= 39910 )
									ret := 0.666667
								if( Raw_Money_Flow > 39910 )
									ret := 0.114286
						if( Typical_Price > 505.638 )
							if( MFI <= 71.9795 )
								if( mf <= 0.339678 )
									ret := 0.086957
								if( mf > 0.339678 )
									ret := 1.000000 // buy
							if( MFI > 71.9795 )
								if( MFI_High <= 2.33192 )
									ret := -0.558824
								if( MFI_High > 2.33192 )
									ret := 0.281250
				if( Raw_Money_Flow > 296239 )
					if( ad_mf <= 45349.9 )
						if( mf <= -0.080924 )
							if( Raw_Money_Flow <= 8.22443e+07 )
								if( Raw_Money_Flow <= 6.76069e+07 )
									ret := -0.004482
								if( Raw_Money_Flow > 6.76069e+07 )
									ret := 0.680000
							if( Raw_Money_Flow > 8.22443e+07 )
								if( Positive_Money_Flow <= 1.0511e+08 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 1.0511e+08 )
									ret := -0.200000
						if( mf > -0.080924 )
							if( Positive_Money_Flow_Sum <= 6.95792e+07 )
								if( Positive_Money_Flow_Sum <= 4.46063e+07 )
									ret := -0.160437
								if( Positive_Money_Flow_Sum > 4.46063e+07 )
									ret := 0.034024
							if( Positive_Money_Flow_Sum > 6.95792e+07 )
								if( Negative_Money_Flow <= 2.25346e+07 )
									ret := -0.146494
								if( Negative_Money_Flow > 2.25346e+07 )
									ret := 0.080692
					if( ad_mf > 45349.9 )
						if( MFI <= 52.2849 )
							if( ad <= 60787.7 )
								ret := -0.230769
							if( ad > 60787.7 )
								if( Money_Flow_Ratio <= 1.06402 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 1.06402 )
									ret := -0.818182 // sell
						if( MFI > 52.2849 )
							if( mf <= -0.054778 )
								if( Negative_Money_Flow_Sum <= 3.08092e+08 )
									ret := 0.375000
								if( Negative_Money_Flow_Sum > 3.08092e+08 )
									ret := 1.000000 // buy
							if( mf > -0.054778 )
								if( Money_Flow_Ratio <= 1.18574 )
									ret := 0.642857
								if( Money_Flow_Ratio > 1.18574 )
									ret := 0.081967
		if( Money_Flow_Ratio > 39.7233 )
			if( ad_mf <= 3621.19 )
				if( Positive_Money_Flow <= 1.30772e+06 )
					ret := 1.000000 // buy
				if( Positive_Money_Flow > 1.30772e+06 )
					if( Positive_Money_Flow <= 5.98914e+06 )
						ret := 0.500000
					if( Positive_Money_Flow > 5.98914e+06 )
						ret := 0.772727 // buy
			if( ad_mf > 3621.19 )
				if( Negative_Money_Flow_Sum <= 480436 )
					ret := -0.461538
				if( Negative_Money_Flow_Sum > 480436 )
					if( MFI <= 98.1449 )
						ret := 0.636364
					if( MFI > 98.1449 )
						ret := 0.111111
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")

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
float op_operation = decision_tree_0_HUBS_15Min_7bc6b0ca(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


