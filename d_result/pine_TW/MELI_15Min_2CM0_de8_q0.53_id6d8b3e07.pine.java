//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: MELI_15Min_2CM0_6d8b3e07 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_15Min_2CM0_6d8b3e07", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_15Min_6d8b3e07(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Typical_Price <= 1200.16 )
		if( Negative_Money_Flow_Sum <= 4.91818e+06 )
			if( MFI <= 99.6746 )
				if( Typical_Price <= 339.121 )
					if( Typical_Price <= 332.085 )
						if( Positive_Money_Flow <= 145759 )
							if( Typical_Price <= 267.865 )
								if( MFI <= 90.9628 )
									ret := 0.000000
								if( MFI > 90.9628 )
									ret := 0.500000
							if( Typical_Price > 267.865 )
								if( MFI_Low <= 74.8213 )
									ret := -0.500000
								if( MFI_Low > 74.8213 )
									ret := -0.750000 // sell
						if( Positive_Money_Flow > 145759 )
							if( ad_mf <= -26210.5 )
								ret := -0.600000
							if( ad_mf > -26210.5 )
								if( ad_mf <= 42562.6 )
									ret := 0.356589
								if( ad_mf > 42562.6 )
									ret := 1.000000 // buy
					if( Typical_Price > 332.085 )
						ret := -1.000000 // sell
				if( Typical_Price > 339.121 )
					if( mf <= 0.342545 )
						if( Positive_Money_Flow_Sum <= 3.57829e+08 )
							if( Negative_Money_Flow_Sum <= 3.4111e+06 )
								if( MFI_High <= -18.8849 )
									ret := 0.500000
								if( MFI_High > -18.8849 )
									ret := 0.985294 // buy
							if( Negative_Money_Flow_Sum > 3.4111e+06 )
								if( Negative_Money_Flow_Sum <= 3.6292e+06 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 3.6292e+06 )
									ret := 0.848485 // buy
						if( Positive_Money_Flow_Sum > 3.57829e+08 )
							if( MFI <= 99.2389 )
								ret := 0.200000
							if( MFI > 99.2389 )
								ret := 0.750000 // buy
					if( mf > 0.342545 )
						if( ad_mf <= 18.3989 )
							if( Money_Flow_Ratio <= 31.767 )
								ret := -0.500000
							if( Money_Flow_Ratio > 31.767 )
								ret := 0.000000
						if( ad_mf > 18.3989 )
							if( MFI <= 98.3507 )
								if( Negative_Money_Flow_Sum <= 4.37364e+06 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow_Sum > 4.37364e+06 )
									ret := 1.000000 // buy
							if( MFI > 98.3507 )
								if( Raw_Money_Flow <= 5.66775e+07 )
									ret := 0.500000
								if( Raw_Money_Flow > 5.66775e+07 )
									ret := 0.000000
			if( MFI > 99.6746 )
				if( mf <= 0.236128 )
					ret := 0.400000
				if( mf > 0.236128 )
					if( Typical_Price <= 690.433 )
						ret := -0.250000
					if( Typical_Price > 690.433 )
						ret := -1.000000 // sell
		if( Negative_Money_Flow_Sum > 4.91818e+06 )
			if( MFI <= 1.8459 )
				if( Negative_Money_Flow <= 18179.8 )
					ret := -0.428571
				if( Negative_Money_Flow > 18179.8 )
					if( ad_mf <= 32440.5 )
						if( Typical_Price <= 475.286 )
							if( Negative_Money_Flow_Sum <= 1.10777e+08 )
								ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 1.10777e+08 )
								ret := -0.250000
						if( Typical_Price > 475.286 )
							if( mf <= -0.442753 )
								if( Negative_Money_Flow <= 1.77494e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 1.77494e+07 )
									ret := 0.777778 // buy
							if( mf > -0.442753 )
								if( Typical_Price <= 1133.71 )
									ret := 0.823529 // buy
								if( Typical_Price > 1133.71 )
									ret := 0.166667
					if( ad_mf > 32440.5 )
						ret := -0.500000
			if( MFI > 1.8459 )
				if( mf <= 0.006166 )
					if( Typical_Price <= 341.596 )
						if( mf <= -0.454814 )
							if( ad_mf <= -70274.2 )
								ret := 0.000000
							if( ad_mf > -70274.2 )
								if( Typical_Price <= 234.438 )
									ret := -0.250000
								if( Typical_Price > 234.438 )
									ret := -0.870968 // sell
						if( mf > -0.454814 )
							if( Money_Flow_Ratio <= 0.072425 )
								if( Negative_Money_Flow_Sum <= 1.59448e+08 )
									ret := 0.787234 // buy
								if( Negative_Money_Flow_Sum > 1.59448e+08 )
									ret := -0.600000
							if( Money_Flow_Ratio > 0.072425 )
								if( MFI_Low <= 15.2013 )
									ret := 0.027368
								if( MFI_Low > 15.2013 )
									ret := 0.121130
					if( Typical_Price > 341.596 )
						if( Negative_Money_Flow <= 1.22187e+06 )
							if( Raw_Money_Flow <= 2.44539e+07 )
								if( Negative_Money_Flow_Sum <= 6.34492e+07 )
									ret := -0.023810
								if( Negative_Money_Flow_Sum > 6.34492e+07 )
									ret := 0.125094
							if( Raw_Money_Flow > 2.44539e+07 )
								if( Positive_Money_Flow_Sum <= 1.10115e+08 )
									ret := -0.269231
								if( Positive_Money_Flow_Sum > 1.10115e+08 )
									ret := 0.016086
						if( Negative_Money_Flow > 1.22187e+06 )
							if( ad <= -171696 )
								ret := 1.000000 // buy
							if( ad > -171696 )
								if( Negative_Money_Flow_Sum <= 2.47615e+08 )
									ret := -0.000499
								if( Negative_Money_Flow_Sum > 2.47615e+08 )
									ret := -0.145359
				if( mf > 0.006166 )
					if( Typical_Price <= 380.537 )
						if( mf <= 0.414341 )
							if( Negative_Money_Flow_Sum <= 1.47539e+07 )
								if( Positive_Money_Flow_Sum <= 3.40879e+07 )
									ret := 0.027184
								if( Positive_Money_Flow_Sum > 3.40879e+07 )
									ret := 0.303030
							if( Negative_Money_Flow_Sum > 1.47539e+07 )
								if( Positive_Money_Flow <= 9.65495e+06 )
									ret := 0.046992
								if( Positive_Money_Flow > 9.65495e+06 )
									ret := -0.068702
						if( mf > 0.414341 )
							if( Positive_Money_Flow_Sum <= 1.97921e+08 )
								if( Negative_Money_Flow_Sum <= 1.39446e+07 )
									ret := 0.294118
								if( Negative_Money_Flow_Sum > 1.39446e+07 )
									ret := -0.269231
							if( Positive_Money_Flow_Sum > 1.97921e+08 )
								if( mf <= 0.675238 )
									ret := -1.000000 // sell
								if( mf > 0.675238 )
									ret := -0.636364
					if( Typical_Price > 380.537 )
						if( Money_Flow_Ratio <= 3.73208 )
							if( Positive_Money_Flow_Sum <= 3.55189e+08 )
								if( Positive_Money_Flow_Sum <= 2.23132e+08 )
									ret := 0.126657
								if( Positive_Money_Flow_Sum > 2.23132e+08 )
									ret := -0.005731
							if( Positive_Money_Flow_Sum > 3.55189e+08 )
								if( MFI_High <= -16.3422 )
									ret := -0.097222
								if( MFI_High > -16.3422 )
									ret := 0.432990
						if( Money_Flow_Ratio > 3.73208 )
							if( ad_mf <= -0.299083 )
								if( Positive_Money_Flow_Sum <= 2.17105e+08 )
									ret := 0.047059
								if( Positive_Money_Flow_Sum > 2.17105e+08 )
									ret := -0.199115
							if( ad_mf > -0.299083 )
								if( Negative_Money_Flow_Sum <= 1.17919e+08 )
									ret := 0.064436
								if( Negative_Money_Flow_Sum > 1.17919e+08 )
									ret := 0.702703 // buy
	if( Typical_Price > 1200.16 )
		if( Negative_Money_Flow_Sum <= 5.00335e+08 )
			if( Positive_Money_Flow <= 1.22643e+08 )
				if( MFI_Low <= -9.23495 )
					if( ad <= -35.2307 )
						if( mf <= -0.222337 )
							if( mf <= -0.611607 )
								ret := -0.250000
							if( mf > -0.611607 )
								if( Positive_Money_Flow_Sum <= 4.47748e+07 )
									ret := 0.741379 // buy
								if( Positive_Money_Flow_Sum > 4.47748e+07 )
									ret := 0.000000
						if( mf > -0.222337 )
							if( Raw_Money_Flow <= 3.47945e+07 )
								if( ad_mf <= -7956.81 )
									ret := -0.307692
								if( ad_mf > -7956.81 )
									ret := 0.152174
							if( Raw_Money_Flow > 3.47945e+07 )
								if( mf <= -0.154089 )
									ret := 0.500000
								if( mf > -0.154089 )
									ret := 1.000000 // buy
					if( ad > -35.2307 )
						if( Raw_Money_Flow <= 9.37691e+06 )
							if( ad_mf <= 13.6404 )
								if( mf <= -0.098964 )
									ret := 0.407407
								if( mf > -0.098964 )
									ret := -0.588235
							if( ad_mf > 13.6404 )
								if( ad <= 704.004 )
									ret := -0.750000 // sell
								if( ad > 704.004 )
									ret := 0.000000
						if( Raw_Money_Flow > 9.37691e+06 )
							if( Negative_Money_Flow_Sum <= 4.31064e+08 )
								if( Positive_Money_Flow_Sum <= 2.3236e+07 )
									ret := 0.083333
								if( Positive_Money_Flow_Sum > 2.3236e+07 )
									ret := 0.461538
							if( Negative_Money_Flow_Sum > 4.31064e+08 )
								if( MFI_Low <= -13.0173 )
									ret := -0.166667
								if( MFI_Low > -13.0173 )
									ret := -1.000000 // sell
				if( MFI_Low > -9.23495 )
					if( Negative_Money_Flow_Sum <= 3.4643e+08 )
						if( Money_Flow_Ratio <= 34.9716 )
							if( mf <= 0.61234 )
								if( Negative_Money_Flow_Sum <= 6.34175e+07 )
									ret := 0.060018
								if( Negative_Money_Flow_Sum > 6.34175e+07 )
									ret := -0.001795
							if( mf > 0.61234 )
								if( Negative_Money_Flow <= 4.36358e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 4.36358e+06 )
									ret := -0.750000 // sell
						if( Money_Flow_Ratio > 34.9716 )
							if( Positive_Money_Flow_Sum <= 3.17137e+08 )
								if( Typical_Price <= 1383.63 )
									ret := -0.500000
								if( Typical_Price > 1383.63 )
									ret := 0.142857
							if( Positive_Money_Flow_Sum > 3.17137e+08 )
								if( ad_mf <= -653.94 )
									ret := -0.181818
								if( ad_mf > -653.94 )
									ret := 0.754717 // buy
					if( Negative_Money_Flow_Sum > 3.4643e+08 )
						if( mf <= 0.17093 )
							if( Raw_Money_Flow <= 946804 )
								if( Negative_Money_Flow_Sum <= 3.65607e+08 )
									ret := -0.411765
								if( Negative_Money_Flow_Sum > 3.65607e+08 )
									ret := 0.551724
							if( Raw_Money_Flow > 946804 )
								if( Positive_Money_Flow_Sum <= 3.53118e+08 )
									ret := -0.266286
								if( Positive_Money_Flow_Sum > 3.53118e+08 )
									ret := 0.130435
						if( mf > 0.17093 )
							if( Raw_Money_Flow <= 5.24596e+06 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 5.24596e+06 )
								if( Negative_Money_Flow_Sum <= 3.56549e+08 )
									ret := -0.250000
								if( Negative_Money_Flow_Sum > 3.56549e+08 )
									ret := 0.611111
			if( Positive_Money_Flow > 1.22643e+08 )
				if( Raw_Money_Flow <= 2.77917e+08 )
					if( mf <= -0.11184 )
						if( MFI <= 54.0977 )
							ret := 1.000000 // buy
						if( MFI > 54.0977 )
							ret := 0.000000
					if( mf > -0.11184 )
						if( Negative_Money_Flow_Sum <= 7.64686e+07 )
							if( Positive_Money_Flow_Sum <= 4.03139e+08 )
								if( MFI <= 91.7082 )
									ret := -0.944444 // sell
								if( MFI > 91.7082 )
									ret := -0.600000
							if( Positive_Money_Flow_Sum > 4.03139e+08 )
								if( Raw_Money_Flow <= 1.78964e+08 )
									ret := -0.600000
								if( Raw_Money_Flow > 1.78964e+08 )
									ret := 0.400000
						if( Negative_Money_Flow_Sum > 7.64686e+07 )
							if( Positive_Money_Flow_Sum <= 2.35925e+08 )
								if( Positive_Money_Flow <= 1.31189e+08 )
									ret := 0.857143 // buy
								if( Positive_Money_Flow > 1.31189e+08 )
									ret := -0.300000
							if( Positive_Money_Flow_Sum > 2.35925e+08 )
								if( Typical_Price <= 1236.13 )
									ret := 0.250000
								if( Typical_Price > 1236.13 )
									ret := -0.583333
				if( Raw_Money_Flow > 2.77917e+08 )
					if( MFI <= 86.976 )
						ret := 1.000000 // buy
					if( MFI > 86.976 )
						ret := 0.000000
		if( Negative_Money_Flow_Sum > 5.00335e+08 )
			if( MFI_Low <= 0.181075 )
				if( ad <= 45042.8 )
					if( Raw_Money_Flow <= 2.4303e+07 )
						if( MFI <= 9.9764 )
							if( Positive_Money_Flow_Sum <= 2.67961e+07 )
								ret := 0.000000
							if( Positive_Money_Flow_Sum > 2.67961e+07 )
								if( MFI_Low <= -11.87 )
									ret := 1.000000 // buy
								if( MFI_Low > -11.87 )
									ret := 0.333333
						if( MFI > 9.9764 )
							if( Typical_Price <= 1354.66 )
								if( Negative_Money_Flow_Sum <= 5.63721e+08 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 5.63721e+08 )
									ret := 0.200000
							if( Typical_Price > 1354.66 )
								if( Positive_Money_Flow_Sum <= 9.75385e+07 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 9.75385e+07 )
									ret := 0.000000
					if( Raw_Money_Flow > 2.4303e+07 )
						if( Negative_Money_Flow <= 6.35048e+07 )
							if( Negative_Money_Flow_Sum <= 5.52311e+08 )
								if( MFI_Low <= -8.54404 )
									ret := 0.833333 // buy
								if( MFI_Low > -8.54404 )
									ret := -0.714286 // sell
							if( Negative_Money_Flow_Sum > 5.52311e+08 )
								if( Negative_Money_Flow_Sum <= 6.19022e+08 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 6.19022e+08 )
									ret := 0.771429 // buy
						if( Negative_Money_Flow > 6.35048e+07 )
							if( Raw_Money_Flow <= 6.87817e+07 )
								ret := -0.600000
							if( Raw_Money_Flow > 6.87817e+07 )
								if( MFI_High <= -75.6759 )
									ret := 0.333333
								if( MFI_High > -75.6759 )
									ret := 0.800000 // buy
				if( ad > 45042.8 )
					ret := -0.833333 // sell
			if( MFI_Low > 0.181075 )
				if( Typical_Price <= 1522.79 )
					if( Negative_Money_Flow_Sum <= 5.79886e+08 )
						if( Money_Flow_Ratio <= 0.619767 )
							if( Typical_Price <= 1316.19 )
								if( Negative_Money_Flow_Sum <= 5.50671e+08 )
									ret := -0.916667 // sell
								if( Negative_Money_Flow_Sum > 5.50671e+08 )
									ret := 0.428571
							if( Typical_Price > 1316.19 )
								if( Typical_Price <= 1438.86 )
									ret := 0.818182 // buy
								if( Typical_Price > 1438.86 )
									ret := 0.000000
						if( Money_Flow_Ratio > 0.619767 )
							if( MFI_High <= -38.6762 )
								ret := -0.500000
							if( MFI_High > -38.6762 )
								ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 5.79886e+08 )
						if( mf <= -0.254856 )
							ret := -0.250000
						if( mf > -0.254856 )
							if( ad_mf <= 39306.9 )
								ret := -1.000000 // sell
							if( ad_mf > 39306.9 )
								ret := -0.750000 // sell
				if( Typical_Price > 1522.79 )
					if( ad_mf <= 7236.12 )
						if( MFI_High <= -57.9827 )
							if( Negative_Money_Flow <= 1.55714e+07 )
								ret := 0.500000
							if( Negative_Money_Flow > 1.55714e+07 )
								if( Positive_Money_Flow_Sum <= 1.50557e+08 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 1.50557e+08 )
									ret := -0.750000 // sell
						if( MFI_High > -57.9827 )
							if( Raw_Money_Flow <= 8.94907e+06 )
								if( Positive_Money_Flow_Sum <= 1.91451e+08 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 1.91451e+08 )
									ret := -0.333333
							if( Raw_Money_Flow > 8.94907e+06 )
								if( mf <= -0.140618 )
									ret := 0.470588
								if( mf > -0.140618 )
									ret := 0.848485 // buy
					if( ad_mf > 7236.12 )
						if( Positive_Money_Flow <= 7.43444e+07 )
							if( Positive_Money_Flow_Sum <= 3.15548e+08 )
								if( Negative_Money_Flow_Sum <= 5.49597e+08 )
									ret := 0.833333 // buy
								if( Negative_Money_Flow_Sum > 5.49597e+08 )
									ret := 0.166667
							if( Positive_Money_Flow_Sum > 3.15548e+08 )
								if( Raw_Money_Flow <= 5.2734e+07 )
									ret := 0.250000
								if( Raw_Money_Flow > 5.2734e+07 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow > 7.43444e+07 )
							if( MFI_High <= -54.2447 )
								ret := 1.000000 // buy
							if( MFI_High > -54.2447 )
								ret := 0.500000
	
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
float op_operation = decision_tree_0_MELI_15Min_6d8b3e07(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


