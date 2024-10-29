//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: AVAXUSDT_30Min_2CM0_b91cd97d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_30Min_2CM0_b91cd97d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_30Min_b91cd97d(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ad <= -25696.6 )
		if( MFI_Low <= 13.917 )
			if( Negative_Money_Flow_Sum <= 3.16648e+07 )
				if( MFI <= 28.1639 )
					if( Raw_Money_Flow <= 1.37921e+06 )
						if( Typical_Price <= 8.86232 )
							if( mf <= -0.283431 )
								if( Positive_Money_Flow_Sum <= 256827 )
									ret := -0.583333
								if( Positive_Money_Flow_Sum > 256827 )
									ret := 1.000000 // buy
							if( mf > -0.283431 )
								if( Positive_Money_Flow_Sum <= 371786 )
									ret := 0.606061
								if( Positive_Money_Flow_Sum > 371786 )
									ret := 0.961538 // buy
						if( Typical_Price > 8.86232 )
							if( Positive_Money_Flow_Sum <= 1.35315e+06 )
								if( mf <= -0.117253 )
									ret := -0.045455
								if( mf > -0.117253 )
									ret := -0.480769
							if( Positive_Money_Flow_Sum > 1.35315e+06 )
								if( Raw_Money_Flow <= 674385 )
									ret := 0.476190
								if( Raw_Money_Flow > 674385 )
									ret := 0.186120
					if( Raw_Money_Flow > 1.37921e+06 )
						if( ad_mf <= -271454 )
							if( ad_mf <= -302350 )
								ret := 1.000000 // buy
							if( ad_mf > -302350 )
								ret := 0.714286 // buy
						if( ad_mf > -271454 )
							if( mf <= -0.210849 )
								if( MFI <= 22.4934 )
									ret := -0.118519
								if( MFI > 22.4934 )
									ret := -0.563830
							if( mf > -0.210849 )
								if( Typical_Price <= 11.7592 )
									ret := 0.619048
								if( Typical_Price > 11.7592 )
									ret := -0.015361
				if( MFI > 28.1639 )
					if( Negative_Money_Flow_Sum <= 3.27561e+06 )
						if( mf <= -0.126771 )
							if( Typical_Price <= 12.5767 )
								if( Negative_Money_Flow_Sum <= 713140 )
									ret := -0.250000
								if( Negative_Money_Flow_Sum > 713140 )
									ret := 0.388889
							if( Typical_Price > 12.5767 )
								ret := -0.500000
						if( mf > -0.126771 )
							if( ad_mf <= -27677.9 )
								if( Negative_Money_Flow <= 212301 )
									ret := -0.250000
								if( Negative_Money_Flow > 212301 )
									ret := -0.814815 // sell
							if( ad_mf > -27677.9 )
								ret := 0.600000
					if( Negative_Money_Flow_Sum > 3.27561e+06 )
						if( Typical_Price <= 13.3003 )
							if( MFI <= 31.4865 )
								if( Negative_Money_Flow <= 403192 )
									ret := 0.000000
								if( Negative_Money_Flow > 403192 )
									ret := 0.700000 // buy
							if( MFI > 31.4865 )
								if( ad_mf <= -44090.9 )
									ret := 1.000000 // buy
								if( ad_mf > -44090.9 )
									ret := 0.777778 // buy
						if( Typical_Price > 13.3003 )
							if( Negative_Money_Flow <= 2.85748e+06 )
								if( ad <= -83864.6 )
									ret := -0.333333
								if( ad > -83864.6 )
									ret := 0.233933
							if( Negative_Money_Flow > 2.85748e+06 )
								if( Negative_Money_Flow_Sum <= 1.53201e+07 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 1.53201e+07 )
									ret := 0.528662
			if( Negative_Money_Flow_Sum > 3.16648e+07 )
				if( Positive_Money_Flow_Sum <= 3.93274e+07 )
					if( Money_Flow_Ratio <= 0.102511 )
						if( Negative_Money_Flow_Sum <= 8.64234e+07 )
							if( Raw_Money_Flow <= 8.9836e+06 )
								if( Positive_Money_Flow_Sum <= 3.28951e+06 )
									ret := 0.357143
								if( Positive_Money_Flow_Sum > 3.28951e+06 )
									ret := -0.571429
							if( Raw_Money_Flow > 8.9836e+06 )
								if( Money_Flow_Ratio <= 0.085921 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 0.085921 )
									ret := -0.500000
						if( Negative_Money_Flow_Sum > 8.64234e+07 )
							if( MFI_Low <= -13.5936 )
								ret := 1.000000 // buy
							if( MFI_Low > -13.5936 )
								ret := 0.750000 // buy
					if( Money_Flow_Ratio > 0.102511 )
						if( MFI <= 17.2916 )
							if( mf <= -0.23014 )
								if( Money_Flow_Ratio <= 0.188175 )
									ret := 0.536585
								if( Money_Flow_Ratio > 0.188175 )
									ret := -0.166667
							if( mf > -0.23014 )
								if( Raw_Money_Flow <= 4.73975e+06 )
									ret := 0.911765 // buy
								if( Raw_Money_Flow > 4.73975e+06 )
									ret := 0.716049 // buy
						if( MFI > 17.2916 )
							if( Typical_Price <= 50.0092 )
								if( Negative_Money_Flow_Sum <= 5.63667e+07 )
									ret := 0.352436
								if( Negative_Money_Flow_Sum > 5.63667e+07 )
									ret := 0.697436
							if( Typical_Price > 50.0092 )
								if( mf <= -0.093475 )
									ret := 0.393229
								if( mf > -0.093475 )
									ret := 0.064000
				if( Positive_Money_Flow_Sum > 3.93274e+07 )
					if( mf <= -0.041605 )
						if( Positive_Money_Flow <= 1.84965e+06 )
							if( Negative_Money_Flow_Sum <= 1.33105e+08 )
								if( Raw_Money_Flow <= 8.3982e+06 )
									ret := 0.666667
								if( Raw_Money_Flow > 8.3982e+06 )
									ret := -0.703704 // sell
							if( Negative_Money_Flow_Sum > 1.33105e+08 )
								if( Negative_Money_Flow_Sum <= 1.81184e+08 )
									ret := 0.800000 // buy
								if( Negative_Money_Flow_Sum > 1.81184e+08 )
									ret := -0.307692
						if( Positive_Money_Flow > 1.84965e+06 )
							if( Typical_Price <= 67.8381 )
								if( mf <= -0.214293 )
									ret := -0.250000
								if( mf > -0.214293 )
									ret := -0.928571 // sell
							if( Typical_Price > 67.8381 )
								ret := 0.000000
					if( mf > -0.041605 )
						if( Typical_Price <= 59.3256 )
							if( Negative_Money_Flow <= 7.28498e+06 )
								ret := -0.857143 // sell
							if( Negative_Money_Flow > 7.28498e+06 )
								if( Negative_Money_Flow_Sum <= 1.57783e+08 )
									ret := 0.166667
								if( Negative_Money_Flow_Sum > 1.57783e+08 )
									ret := 1.000000 // buy
						if( Typical_Price > 59.3256 )
							if( Typical_Price <= 119.237 )
								if( mf <= 0.053488 )
									ret := -0.972222 // sell
								if( mf > 0.053488 )
									ret := -0.571429
							if( Typical_Price > 119.237 )
								ret := 0.000000
		if( MFI_Low > 13.917 )
			if( MFI <= 36.281 )
				if( Raw_Money_Flow <= 904122 )
					if( Typical_Price <= 8.23273 )
						if( Raw_Money_Flow <= 286866 )
							ret := 0.750000 // buy
						if( Raw_Money_Flow > 286866 )
							ret := 1.000000 // buy
					if( Typical_Price > 8.23273 )
						if( Typical_Price <= 21.6703 )
							if( ad_mf <= -26744.8 )
								if( MFI_Low <= 14.196 )
									ret := -0.750000 // sell
								if( MFI_Low > 14.196 )
									ret := 0.121212
							if( ad_mf > -26744.8 )
								ret := 1.000000 // buy
						if( Typical_Price > 21.6703 )
							ret := 1.000000 // buy
				if( Raw_Money_Flow > 904122 )
					if( Negative_Money_Flow_Sum <= 1.04913e+08 )
						if( ad_mf <= -115629 )
							if( Negative_Money_Flow <= 1.26174e+06 )
								ret := -0.750000 // sell
							if( Negative_Money_Flow > 1.26174e+06 )
								if( MFI <= 35.3637 )
									ret := 0.900000 // buy
								if( MFI > 35.3637 )
									ret := 0.250000
						if( ad_mf > -115629 )
							if( mf <= 0.043673 )
								if( Typical_Price <= 23.3262 )
									ret := -0.426471
								if( Typical_Price > 23.3262 )
									ret := -0.040486
							if( mf > 0.043673 )
								if( Positive_Money_Flow_Sum <= 3.78576e+06 )
									ret := 0.571429
								if( Positive_Money_Flow_Sum > 3.78576e+06 )
									ret := -0.541667
					if( Negative_Money_Flow_Sum > 1.04913e+08 )
						if( Negative_Money_Flow_Sum <= 1.48995e+08 )
							if( MFI <= 34.2606 )
								ret := -0.285714
							if( MFI > 34.2606 )
								if( mf <= -0.107842 )
									ret := -0.250000
								if( mf > -0.107842 )
									ret := -0.974359 // sell
						if( Negative_Money_Flow_Sum > 1.48995e+08 )
							if( mf <= -0.073084 )
								ret := 1.000000 // buy
							if( mf > -0.073084 )
								if( Raw_Money_Flow <= 1.11393e+07 )
									ret := 0.428571
								if( Raw_Money_Flow > 1.11393e+07 )
									ret := -1.000000 // sell
			if( MFI > 36.281 )
				if( Positive_Money_Flow <= 4.23762e+06 )
					if( Money_Flow_Ratio <= 1.88143 )
						if( Negative_Money_Flow <= 1.7899e+07 )
							if( MFI <= 48.9426 )
								if( Negative_Money_Flow <= 242523 )
									ret := -0.074303
								if( Negative_Money_Flow > 242523 )
									ret := 0.156594
							if( MFI > 48.9426 )
								if( Negative_Money_Flow_Sum <= 3.06501e+06 )
									ret := 0.270936
								if( Negative_Money_Flow_Sum > 3.06501e+06 )
									ret := 0.001273
						if( Negative_Money_Flow > 1.7899e+07 )
							if( Typical_Price <= 135.533 )
								if( ad_mf <= -34489.4 )
									ret := 0.650407
								if( ad_mf > -34489.4 )
									ret := 0.000000
							if( Typical_Price > 135.533 )
								ret := -0.750000 // sell
					if( Money_Flow_Ratio > 1.88143 )
						if( Positive_Money_Flow_Sum <= 1.87797e+06 )
							if( Typical_Price <= 3.37 )
								ret := 0.200000
							if( Typical_Price > 3.37 )
								if( Typical_Price <= 3.86454 )
									ret := -1.000000 // sell
								if( Typical_Price > 3.86454 )
									ret := -0.200000
						if( Positive_Money_Flow_Sum > 1.87797e+06 )
							if( Raw_Money_Flow <= 1.00497e+07 )
								if( Positive_Money_Flow_Sum <= 8.0875e+07 )
									ret := 0.193548
								if( Positive_Money_Flow_Sum > 8.0875e+07 )
									ret := 0.441558
							if( Raw_Money_Flow > 1.00497e+07 )
								if( mf <= 0.282377 )
									ret := 0.066667
								if( mf > 0.282377 )
									ret := -0.666667
				if( Positive_Money_Flow > 4.23762e+06 )
					if( Typical_Price <= 19.585 )
						if( MFI <= 88.392 )
							if( MFI_Low <= 34.4361 )
								ret := -0.285714
							if( MFI_Low > 34.4361 )
								if( ad <= -47584.5 )
									ret := 0.600000
								if( ad > -47584.5 )
									ret := -0.250000
						if( MFI > 88.392 )
							if( Typical_Price <= 14.845 )
								ret := -0.600000
							if( Typical_Price > 14.845 )
								ret := 0.000000
					if( Typical_Price > 19.585 )
						if( Negative_Money_Flow <= 9.34153e+06 )
							if( MFI <= 76.5499 )
								if( Money_Flow_Ratio <= 2.30843 )
									ret := -0.075929
								if( Money_Flow_Ratio > 2.30843 )
									ret := -0.446328
							if( MFI > 76.5499 )
								if( MFI <= 81.5531 )
									ret := 0.321429
								if( MFI > 81.5531 )
									ret := -0.202532
						if( Negative_Money_Flow > 9.34153e+06 )
							ret := 1.000000 // buy
	if( ad > -25696.6 )
		if( Negative_Money_Flow <= 2.57203e+07 )
			if( Typical_Price <= 84.5745 )
				if( Typical_Price <= 3.63568 )
					if( Money_Flow_Ratio <= 0.248718 )
						if( Negative_Money_Flow <= 36332.6 )
							if( mf <= -0.222716 )
								if( Raw_Money_Flow <= 31820.4 )
									ret := 0.181818
								if( Raw_Money_Flow > 31820.4 )
									ret := -0.578947
							if( mf > -0.222716 )
								if( Positive_Money_Flow_Sum <= 124789 )
									ret := 0.666667
								if( Positive_Money_Flow_Sum > 124789 )
									ret := 0.000000
						if( Negative_Money_Flow > 36332.6 )
							if( mf <= -0.353 )
								if( ad <= -5152.17 )
									ret := 0.444444
								if( ad > -5152.17 )
									ret := -0.750000 // sell
							if( mf > -0.353 )
								if( Money_Flow_Ratio <= 0.170831 )
									ret := 0.588235
								if( Money_Flow_Ratio > 0.170831 )
									ret := 0.895349 // buy
					if( Money_Flow_Ratio > 0.248718 )
						if( ad_mf <= 775.177 )
							if( Positive_Money_Flow_Sum <= 64032.9 )
								if( MFI_Low <= 5.9537 )
									ret := 0.454545
								if( MFI_Low > 5.9537 )
									ret := -0.557692
							if( Positive_Money_Flow_Sum > 64032.9 )
								if( Negative_Money_Flow_Sum <= 358039 )
									ret := 0.290598
								if( Negative_Money_Flow_Sum > 358039 )
									ret := 0.057034
						if( ad_mf > 775.177 )
							if( mf <= 0.304899 )
								if( Negative_Money_Flow_Sum <= 1.17741e+06 )
									ret := -0.005362
								if( Negative_Money_Flow_Sum > 1.17741e+06 )
									ret := 0.511628
							if( mf > 0.304899 )
								if( Typical_Price <= 3.15389 )
									ret := 0.285714
								if( Typical_Price > 3.15389 )
									ret := -0.500000
				if( Typical_Price > 3.63568 )
					if( Positive_Money_Flow_Sum <= 1.13998e+06 )
						if( Negative_Money_Flow_Sum <= 2.52217e+06 )
							if( Money_Flow_Ratio <= 1.12564 )
								if( ad <= 29895.9 )
									ret := 0.026339
								if( ad > 29895.9 )
									ret := 0.421053
							if( Money_Flow_Ratio > 1.12564 )
								if( Positive_Money_Flow_Sum <= 394782 )
									ret := 0.023810
								if( Positive_Money_Flow_Sum > 394782 )
									ret := -0.131868
						if( Negative_Money_Flow_Sum > 2.52217e+06 )
							if( Typical_Price <= 17.9725 )
								if( Typical_Price <= 13.2309 )
									ret := -0.099119
								if( Typical_Price > 13.2309 )
									ret := -0.259669
							if( Typical_Price > 17.9725 )
								if( Negative_Money_Flow_Sum <= 1.78925e+07 )
									ret := 0.144578
								if( Negative_Money_Flow_Sum > 1.78925e+07 )
									ret := -0.800000 // sell
					if( Positive_Money_Flow_Sum > 1.13998e+06 )
						if( Positive_Money_Flow_Sum <= 3.37168e+07 )
							if( MFI_Low <= 14.9939 )
								if( Negative_Money_Flow_Sum <= 2.29498e+06 )
									ret := 0.888889 // buy
								if( Negative_Money_Flow_Sum > 2.29498e+06 )
									ret := 0.089349
							if( MFI_Low > 14.9939 )
								if( Typical_Price <= 11.8631 )
									ret := 0.109130
								if( Typical_Price > 11.8631 )
									ret := 0.030196
						if( Positive_Money_Flow_Sum > 3.37168e+07 )
							if( Money_Flow_Ratio <= 0.556639 )
								if( Raw_Money_Flow <= 1.32027e+07 )
									ret := -0.455830
								if( Raw_Money_Flow > 1.32027e+07 )
									ret := 0.215909
							if( Money_Flow_Ratio > 0.556639 )
								if( Negative_Money_Flow_Sum <= 6.75617e+07 )
									ret := -0.030794
								if( Negative_Money_Flow_Sum > 6.75617e+07 )
									ret := 0.155206
			if( Typical_Price > 84.5745 )
				if( Money_Flow_Ratio <= 3.30367 )
					if( Positive_Money_Flow_Sum <= 2.18614e+08 )
						if( Positive_Money_Flow <= 1.5733e+07 )
							if( mf <= -0.025554 )
								if( Typical_Price <= 114.743 )
									ret := 0.049296
								if( Typical_Price > 114.743 )
									ret := -0.326087
							if( mf > -0.025554 )
								if( Money_Flow_Ratio <= 0.794941 )
									ret := -0.331852
								if( Money_Flow_Ratio > 0.794941 )
									ret := -0.104505
						if( Positive_Money_Flow > 1.5733e+07 )
							if( Negative_Money_Flow_Sum <= 5.04824e+07 )
								if( Raw_Money_Flow <= 1.88172e+07 )
									ret := 0.692308
								if( Raw_Money_Flow > 1.88172e+07 )
									ret := -0.500000
							if( Negative_Money_Flow_Sum > 5.04824e+07 )
								if( ad_mf <= 1345.71 )
									ret := -0.714286 // sell
								if( ad_mf > 1345.71 )
									ret := 0.570312
					if( Positive_Money_Flow_Sum > 2.18614e+08 )
						if( Raw_Money_Flow <= 1.38741e+07 )
							if( Money_Flow_Ratio <= 2.39837 )
								ret := -1.000000 // sell
							if( Money_Flow_Ratio > 2.39837 )
								ret := 0.400000
						if( Raw_Money_Flow > 1.38741e+07 )
							ret := -1.000000 // sell
				if( Money_Flow_Ratio > 3.30367 )
					if( MFI_High <= 7.27762 )
						if( Positive_Money_Flow_Sum <= 2.35077e+08 )
							if( mf <= 0.276102 )
								if( Positive_Money_Flow_Sum <= 4.46449e+07 )
									ret := -0.044444
								if( Positive_Money_Flow_Sum > 4.46449e+07 )
									ret := 0.554974
							if( mf > 0.276102 )
								if( Raw_Money_Flow <= 7.76574e+06 )
									ret := 0.468750
								if( Raw_Money_Flow > 7.76574e+06 )
									ret := -0.382353
						if( Positive_Money_Flow_Sum > 2.35077e+08 )
							if( MFI_High <= 1.30262 )
								ret := -1.000000 // sell
							if( MFI_High > 1.30262 )
								ret := 0.000000
					if( MFI_High > 7.27762 )
						if( Negative_Money_Flow <= 412574 )
							if( Positive_Money_Flow_Sum <= 1.13532e+08 )
								if( Negative_Money_Flow_Sum <= 1.05971e+07 )
									ret := -0.166667
								if( Negative_Money_Flow_Sum > 1.05971e+07 )
									ret := 0.400000
							if( Positive_Money_Flow_Sum > 1.13532e+08 )
								if( Typical_Price <= 117.505 )
									ret := -0.750000 // sell
								if( Typical_Price > 117.505 )
									ret := 0.000000
						if( Negative_Money_Flow > 412574 )
							if( mf <= 0.307328 )
								ret := -0.750000 // sell
							if( mf > 0.307328 )
								ret := -1.000000 // sell
		if( Negative_Money_Flow > 2.57203e+07 )
			if( Negative_Money_Flow_Sum <= 2.28059e+08 )
				if( mf <= -0.053276 )
					if( mf <= -0.106915 )
						ret := 1.000000 // buy
					if( mf > -0.106915 )
						ret := -0.285714
				if( mf > -0.053276 )
					if( mf <= 0.203826 )
						if( Money_Flow_Ratio <= 0.419215 )
							ret := 0.500000
						if( Money_Flow_Ratio > 0.419215 )
							if( Typical_Price <= 72.8563 )
								ret := 1.000000 // buy
							if( Typical_Price > 72.8563 )
								ret := 0.666667
					if( mf > 0.203826 )
						ret := 0.250000
			if( Negative_Money_Flow_Sum > 2.28059e+08 )
				ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_AVAXUSDT_30Min_b91cd97d(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


