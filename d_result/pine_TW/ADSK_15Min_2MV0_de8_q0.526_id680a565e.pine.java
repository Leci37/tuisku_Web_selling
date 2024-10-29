//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: ADSK_15Min_2MV0_680a565e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADSK_15Min_2MV0_680a565e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADSK_15Min_680a565e(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Raw_Money_Flow <= 1.68888e+06 )
		if( Positive_Money_Flow <= 654.402 )
			if( Positive_Money_Flow_Sum <= 1.90201e+08 )
				if( Positive_Money_Flow_Sum <= 1.76395e+08 )
					if( Positive_Money_Flow_Sum <= 1.70509e+08 )
						if( Negative_Money_Flow_Sum <= 2.75468e+08 )
							if( MFI_High <= -74.4548 )
								if( VIP <= 0.913137 )
									ret := -0.666667
								if( VIP > 0.913137 )
									ret := 0.043478
							if( MFI_High > -74.4548 )
								if( VIP <= 1.58786 )
									ret := 0.223978
								if( VIP > 1.58786 )
									ret := 0.067340
						if( Negative_Money_Flow_Sum > 2.75468e+08 )
							if( Positive_Money_Flow_Sum <= 5.48955e+07 )
								if( VIP <= 0.774435 )
									ret := 0.125000
								if( VIP > 0.774435 )
									ret := 0.771429 // buy
							if( Positive_Money_Flow_Sum > 5.48955e+07 )
								if( MFI <= 19.0388 )
									ret := -0.368421
								if( MFI > 19.0388 )
									ret := 0.523810
					if( Positive_Money_Flow_Sum > 1.70509e+08 )
						if( VIM <= 1.04687 )
							if( Positive_Money_Flow_Sum <= 1.73111e+08 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 1.73111e+08 )
								ret := -0.200000
						if( VIM > 1.04687 )
							if( Positive_Money_Flow_Sum <= 1.74211e+08 )
								ret := 0.285714
							if( Positive_Money_Flow_Sum > 1.74211e+08 )
								ret := -0.800000 // sell
				if( Positive_Money_Flow_Sum > 1.76395e+08 )
					if( VIP_VIM <= 0.828212 )
						if( MFI_High <= -13.291 )
							if( Raw_Money_Flow <= 111109 )
								ret := -0.200000
							if( Raw_Money_Flow > 111109 )
								if( Negative_Money_Flow <= 207539 )
									ret := 0.250000
								if( Negative_Money_Flow > 207539 )
									ret := 0.750000 // buy
						if( MFI_High > -13.291 )
							if( VIM <= 0.911615 )
								if( Positive_Money_Flow_Sum <= 1.87541e+08 )
									ret := 0.777778 // buy
								if( Positive_Money_Flow_Sum > 1.87541e+08 )
									ret := -0.750000 // sell
							if( VIM > 0.911615 )
								if( VIM <= 1.7798 )
									ret := 0.914894 // buy
								if( VIM > 1.7798 )
									ret := 0.200000
					if( VIP_VIM > 0.828212 )
						ret := -0.500000
			if( Positive_Money_Flow_Sum > 1.90201e+08 )
				if( Money_Flow_Ratio <= 36.1907 )
					if( Negative_Money_Flow_Sum <= 1.20622e+07 )
						ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 1.20622e+07 )
						if( VIP_VIM <= 0.041802 )
							if( VIP <= 1.04187 )
								if( Negative_Money_Flow_Sum <= 1.51123e+08 )
									ret := -0.272727
								if( Negative_Money_Flow_Sum > 1.51123e+08 )
									ret := 0.625000
							if( VIP > 1.04187 )
								if( Positive_Money_Flow_Sum <= 2.32954e+08 )
									ret := 0.240000
								if( Positive_Money_Flow_Sum > 2.32954e+08 )
									ret := 0.777778 // buy
						if( VIP_VIM > 0.041802 )
							if( VIP <= 1.2032 )
								if( Negative_Money_Flow_Sum <= 1.16079e+08 )
									ret := -0.618182
								if( Negative_Money_Flow_Sum > 1.16079e+08 )
									ret := 0.333333
							if( VIP > 1.2032 )
								if( Positive_Money_Flow_Sum <= 6.88238e+08 )
									ret := 0.061856
								if( Positive_Money_Flow_Sum > 6.88238e+08 )
									ret := -0.846154 // sell
				if( Money_Flow_Ratio > 36.1907 )
					if( VIP <= 1.83756 )
						if( Typical_Price <= 238.42 )
							if( MFI <= 98.6122 )
								ret := 1.000000 // buy
							if( MFI > 98.6122 )
								ret := 0.250000
						if( Typical_Price > 238.42 )
							ret := -0.200000
					if( VIP > 1.83756 )
						ret := 1.000000 // buy
		if( Positive_Money_Flow > 654.402 )
			if( Negative_Money_Flow <= 65.2929 )
				if( VIP_VIM <= -0.26335 )
					if( Positive_Money_Flow_Sum <= 516764 )
						if( Typical_Price <= 194.045 )
							ret := -0.250000
						if( Typical_Price > 194.045 )
							if( Typical_Price <= 273.833 )
								if( VIP_VIM <= -0.669747 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.669747 )
									ret := 0.600000
							if( Typical_Price > 273.833 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 516764 )
						if( Negative_Money_Flow_Sum <= 2.65584e+08 )
							if( VIP <= 0.91751 )
								if( Negative_Money_Flow_Sum <= 2.13635e+08 )
									ret := 0.029900
								if( Negative_Money_Flow_Sum > 2.13635e+08 )
									ret := -0.589744
							if( VIP > 0.91751 )
								if( VIP <= 1.29241 )
									ret := -0.326284
								if( VIP > 1.29241 )
									ret := 0.045455
						if( Negative_Money_Flow_Sum > 2.65584e+08 )
							if( Positive_Money_Flow_Sum <= 2.28783e+06 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 2.28783e+06 )
								if( VIP <= 0.946838 )
									ret := -0.025641
								if( VIP > 0.946838 )
									ret := 0.615385
				if( VIP_VIM > -0.26335 )
					if( MFI <= 80.4042 )
						if( MFI_Low <= 54.985 )
							if( Money_Flow_Ratio <= 0.536512 )
								if( Negative_Money_Flow_Sum <= 1.67862e+08 )
									ret := 0.261404
								if( Negative_Money_Flow_Sum > 1.67862e+08 )
									ret := -0.078261
							if( Money_Flow_Ratio > 0.536512 )
								if( Money_Flow_Ratio <= 0.732722 )
									ret := -0.200772
								if( Money_Flow_Ratio > 0.732722 )
									ret := 0.037201
						if( MFI_Low > 54.985 )
							if( VIP_VIM <= 0.264206 )
								if( MFI_High <= -1.44305 )
									ret := -0.101449
								if( MFI_High > -1.44305 )
									ret := 0.404762
							if( VIP_VIM > 0.264206 )
								if( Positive_Money_Flow_Sum <= 2.29467e+08 )
									ret := 0.639640
								if( Positive_Money_Flow_Sum > 2.29467e+08 )
									ret := -0.181818
					if( MFI > 80.4042 )
						if( Negative_Money_Flow_Sum <= 2.32032e+07 )
							if( Positive_Money_Flow_Sum <= 3.70734e+06 )
								if( VIP_VIM <= 0.050587 )
									ret := -0.750000 // sell
								if( VIP_VIM > 0.050587 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 3.70734e+06 )
								if( Positive_Money_Flow_Sum <= 1.54502e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 1.54502e+07 )
									ret := 0.042373
						if( Negative_Money_Flow_Sum > 2.32032e+07 )
							if( Raw_Money_Flow <= 44157.9 )
								if( VIP <= 1.18011 )
									ret := 0.588235
								if( VIP > 1.18011 )
									ret := -0.157143
							if( Raw_Money_Flow > 44157.9 )
								if( VIP <= 1.28927 )
									ret := -0.191781
								if( VIP > 1.28927 )
									ret := -0.643836
			if( Negative_Money_Flow > 65.2929 )
				if( Positive_Money_Flow_Sum <= 4.38082e+08 )
					if( Negative_Money_Flow_Sum <= 1.79324e+08 )
						if( Negative_Money_Flow_Sum <= 9.55393e+07 )
							if( Money_Flow_Ratio <= 6.63851 )
								if( Money_Flow_Ratio <= 5.32086 )
									ret := 0.106468
								if( Money_Flow_Ratio > 5.32086 )
									ret := -0.384615
							if( Money_Flow_Ratio > 6.63851 )
								if( VIP <= 1.39774 )
									ret := 0.755102 // buy
								if( VIP > 1.39774 )
									ret := 0.284553
						if( Negative_Money_Flow_Sum > 9.55393e+07 )
							if( VIP_VIM <= 0.262655 )
								if( Negative_Money_Flow_Sum <= 1.47509e+08 )
									ret := 0.516129
								if( Negative_Money_Flow_Sum > 1.47509e+08 )
									ret := 0.096386
							if( VIP_VIM > 0.262655 )
								if( MFI_High <= -5.13953 )
									ret := 0.010309
								if( MFI_High > -5.13953 )
									ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 1.79324e+08 )
						if( Negative_Money_Flow_Sum <= 2.64496e+08 )
							if( MFI_Low <= -10.7178 )
								if( Negative_Money_Flow_Sum <= 2.53885e+08 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 2.53885e+08 )
									ret := 0.500000
							if( MFI_Low > -10.7178 )
								if( Positive_Money_Flow_Sum <= 2.41959e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 2.41959e+07 )
									ret := -0.268293
						if( Negative_Money_Flow_Sum > 2.64496e+08 )
							if( Negative_Money_Flow_Sum <= 4.05784e+08 )
								if( VIP_VIM <= -0.931783 )
									ret := -1.000000 // sell
								if( VIP_VIM > -0.931783 )
									ret := 0.803279 // buy
							if( Negative_Money_Flow_Sum > 4.05784e+08 )
								if( VIM <= 1.4435 )
									ret := -0.833333 // sell
								if( VIM > 1.4435 )
									ret := 0.500000
				if( Positive_Money_Flow_Sum > 4.38082e+08 )
					if( VIM <= 1.08106 )
						ret := -0.500000
					if( VIM > 1.08106 )
						ret := -1.000000 // sell
	if( Raw_Money_Flow > 1.68888e+06 )
		if( Positive_Money_Flow_Sum <= 5.3577e+08 )
			if( Typical_Price <= 197.508 )
				if( MFI_High <= -6.75077 )
					if( MFI <= 8.80064 )
						if( Money_Flow_Ratio <= 0.012792 )
							if( Negative_Money_Flow_Sum <= 1.50676e+08 )
								if( Negative_Money_Flow_Sum <= 1.30311e+08 )
									ret := 0.176471
								if( Negative_Money_Flow_Sum > 1.30311e+08 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 1.50676e+08 )
								if( MFI <= 0.084561 )
									ret := 0.111111
								if( MFI > 0.084561 )
									ret := -0.744186 // sell
						if( Money_Flow_Ratio > 0.012792 )
							if( MFI_Low <= -17.5435 )
								if( Typical_Price <= 185.47 )
									ret := 0.825000 // buy
								if( Typical_Price > 185.47 )
									ret := 0.000000
							if( MFI_Low > -17.5435 )
								if( Negative_Money_Flow_Sum <= 1.07373e+08 )
									ret := 0.536842
								if( Negative_Money_Flow_Sum > 1.07373e+08 )
									ret := 0.214900
					if( MFI > 8.80064 )
						if( Negative_Money_Flow_Sum <= 3.31392e+08 )
							if( Positive_Money_Flow <= 5.52356e+06 )
								if( VIP <= 1.83279 )
									ret := 0.017575
								if( VIP > 1.83279 )
									ret := 0.505376
							if( Positive_Money_Flow > 5.52356e+06 )
								if( Negative_Money_Flow_Sum <= 2.82145e+08 )
									ret := 0.075567
								if( Negative_Money_Flow_Sum > 2.82145e+08 )
									ret := 0.674419
						if( Negative_Money_Flow_Sum > 3.31392e+08 )
							if( MFI <= 29.0205 )
								if( VIP_VIM <= -0.72387 )
									ret := 0.333333
								if( VIP_VIM > -0.72387 )
									ret := -0.687500
							if( MFI > 29.0205 )
								if( Raw_Money_Flow <= 6.26886e+07 )
									ret := -0.230769
								if( Raw_Money_Flow > 6.26886e+07 )
									ret := 0.750000 // buy
				if( MFI_High > -6.75077 )
					if( MFI_High <= 17.6803 )
						if( VIM <= 1.23108 )
							if( Negative_Money_Flow <= 1.85511e+07 )
								if( Negative_Money_Flow_Sum <= 4.20705e+07 )
									ret := 0.120782
								if( Negative_Money_Flow_Sum > 4.20705e+07 )
									ret := 0.273717
							if( Negative_Money_Flow > 1.85511e+07 )
								if( Positive_Money_Flow_Sum <= 3.71106e+08 )
									ret := -0.444444
								if( Positive_Money_Flow_Sum > 3.71106e+08 )
									ret := 0.555556
						if( VIM > 1.23108 )
							if( Positive_Money_Flow_Sum <= 4.04033e+08 )
								if( MFI_High <= 4.44617 )
									ret := 0.462783
								if( MFI_High > 4.44617 )
									ret := 0.179487
							if( Positive_Money_Flow_Sum > 4.04033e+08 )
								ret := -1.000000 // sell
					if( MFI_High > 17.6803 )
						if( VIP_VIM <= 0.534694 )
							ret := -1.000000 // sell
						if( VIP_VIM > 0.534694 )
							if( Positive_Money_Flow_Sum <= 1.2951e+08 )
								if( Money_Flow_Ratio <= 799.1 )
									ret := 0.344828
								if( Money_Flow_Ratio > 799.1 )
									ret := -0.416667
							if( Positive_Money_Flow_Sum > 1.2951e+08 )
								if( VIP_VIM <= 0.695216 )
									ret := 0.333333
								if( VIP_VIM > 0.695216 )
									ret := -0.578947
			if( Typical_Price > 197.508 )
				if( Raw_Money_Flow <= 9.15807e+06 )
					if( Negative_Money_Flow_Sum <= 2.45715e+08 )
						if( Negative_Money_Flow_Sum <= 1.8828e+08 )
							if( Positive_Money_Flow_Sum <= 3.13944e+06 )
								if( VIP_VIM <= -0.776112 )
									ret := -0.842105 // sell
								if( VIP_VIM > -0.776112 )
									ret := -0.400000
							if( Positive_Money_Flow_Sum > 3.13944e+06 )
								if( Negative_Money_Flow_Sum <= 1.83854e+08 )
									ret := -0.019912
								if( Negative_Money_Flow_Sum > 1.83854e+08 )
									ret := 0.426667
						if( Negative_Money_Flow_Sum > 1.8828e+08 )
							if( VIM <= 1.44888 )
								if( Raw_Money_Flow <= 5.34112e+06 )
									ret := 0.053030
								if( Raw_Money_Flow > 5.34112e+06 )
									ret := -0.257951
							if( VIM > 1.44888 )
								if( VIP <= 0.717408 )
									ret := 0.200000
								if( VIP > 0.717408 )
									ret := -0.732143 // sell
					if( Negative_Money_Flow_Sum > 2.45715e+08 )
						if( Negative_Money_Flow <= 87960.8 )
							if( Negative_Money_Flow <= 312.276 )
								if( VIP <= 0.884486 )
									ret := 0.705882 // buy
								if( VIP > 0.884486 )
									ret := 0.000000
							if( Negative_Money_Flow > 312.276 )
								if( Positive_Money_Flow_Sum <= 4.97661e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 4.97661e+07 )
									ret := -0.500000
						if( Negative_Money_Flow > 87960.8 )
							if( VIP_VIM <= -0.54995 )
								if( MFI <= 8.02798 )
									ret := -0.800000 // sell
								if( MFI > 8.02798 )
									ret := 0.250000
							if( VIP_VIM > -0.54995 )
								if( VIP_VIM <= 0.269388 )
									ret := 0.719101 // buy
								if( VIP_VIM > 0.269388 )
									ret := -0.428571
				if( Raw_Money_Flow > 9.15807e+06 )
					if( Positive_Money_Flow_Sum <= 1.31737e+08 )
						if( Raw_Money_Flow <= 2.86266e+07 )
							if( Negative_Money_Flow_Sum <= 1.6019e+08 )
								if( MFI <= 33.3942 )
									ret := 0.161187
								if( MFI > 33.3942 )
									ret := 0.048821
							if( Negative_Money_Flow_Sum > 1.6019e+08 )
								if( VIM <= 1.17898 )
									ret := 0.143403
								if( VIM > 1.17898 )
									ret := -0.141692
						if( Raw_Money_Flow > 2.86266e+07 )
							if( VIM <= 0.797105 )
								if( MFI_Low <= 72.8313 )
									ret := -0.281046
								if( MFI_Low > 72.8313 )
									ret := 1.000000 // buy
							if( VIM > 0.797105 )
								if( Positive_Money_Flow_Sum <= 2.32639e+07 )
									ret := -0.178771
								if( Positive_Money_Flow_Sum > 2.32639e+07 )
									ret := 0.193850
					if( Positive_Money_Flow_Sum > 1.31737e+08 )
						if( VIM <= 1.04866 )
							if( Typical_Price <= 265.733 )
								if( Positive_Money_Flow_Sum <= 1.52551e+08 )
									ret := -0.073446
								if( Positive_Money_Flow_Sum > 1.52551e+08 )
									ret := 0.150038
							if( Typical_Price > 265.733 )
								if( VIP <= 1.71786 )
									ret := -0.105528
								if( VIP > 1.71786 )
									ret := 0.714286 // buy
						if( VIM > 1.04866 )
							if( Negative_Money_Flow <= 3.68075e+07 )
								if( Negative_Money_Flow_Sum <= 6.51403e+08 )
									ret := -0.099554
								if( Negative_Money_Flow_Sum > 6.51403e+08 )
									ret := 0.722222 // buy
							if( Negative_Money_Flow > 3.68075e+07 )
								if( VIP_VIM <= -0.498632 )
									ret := 0.333333
								if( VIP_VIM > -0.498632 )
									ret := -0.763636 // sell
		if( Positive_Money_Flow_Sum > 5.3577e+08 )
			if( Typical_Price <= 270.315 )
				if( Positive_Money_Flow <= 8.59681e+07 )
					if( VIM <= 0.827617 )
						if( VIP_VIM <= 0.475216 )
							if( MFI <= 84.1915 )
								ret := 0.000000
							if( MFI > 84.1915 )
								ret := -0.250000
						if( VIP_VIM > 0.475216 )
							if( VIP_VIM <= 0.533175 )
								ret := 1.000000 // buy
							if( VIP_VIM > 0.533175 )
								if( Positive_Money_Flow_Sum <= 6.52296e+08 )
									ret := 0.700000 // buy
								if( Positive_Money_Flow_Sum > 6.52296e+08 )
									ret := 0.000000
					if( VIM > 0.827617 )
						if( MFI_Low <= 33.8393 )
							ret := 0.200000
						if( MFI_Low > 33.8393 )
							if( Typical_Price <= 134.474 )
								ret := 0.750000 // buy
							if( Typical_Price > 134.474 )
								if( Positive_Money_Flow_Sum <= 1.22751e+09 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 1.22751e+09 )
									ret := 0.750000 // buy
				if( Positive_Money_Flow > 8.59681e+07 )
					if( Negative_Money_Flow_Sum <= 8.70061e+07 )
						ret := 0.500000
					if( Negative_Money_Flow_Sum > 8.70061e+07 )
						ret := -0.400000
			if( Typical_Price > 270.315 )
				if( MFI <= 59.9528 )
					if( Positive_Money_Flow_Sum <= 5.6073e+08 )
						ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 5.6073e+08 )
						ret := 0.750000 // buy
				if( MFI > 59.9528 )
					if( Raw_Money_Flow <= 4.78792e+07 )
						if( Typical_Price <= 294.706 )
							ret := -1.000000 // sell
						if( Typical_Price > 294.706 )
							ret := -0.400000
					if( Raw_Money_Flow > 4.78792e+07 )
						ret := 0.250000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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


//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_ADSK_15Min_680a565e(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, VIP, VIM, VIP_VIM)

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


