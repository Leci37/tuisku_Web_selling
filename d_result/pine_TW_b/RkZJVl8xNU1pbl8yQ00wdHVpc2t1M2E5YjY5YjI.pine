//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: FFIV_15Min_2CM0_3a9b69b2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_FFIV_15Min_2CM0_3a9b69b2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_FFIV_15Min_3a9b69b2(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Typical_Price <= 145.198 )
		if( Negative_Money_Flow_Sum <= 6.89381e+06 )
			if( Positive_Money_Flow <= 1.8455e+06 )
				if( mf <= -0.132655 )
					if( MFI_High <= -50.1259 )
						if( ad_mf <= 549.626 )
							ret := 1.000000 // buy
						if( ad_mf > 549.626 )
							ret := 0.900000 // buy
					if( MFI_High > -50.1259 )
						if( Money_Flow_Ratio <= 4.07921 )
							if( MFI <= 34.5952 )
								ret := -0.400000
							if( MFI > 34.5952 )
								if( MFI_High <= -37.5551 )
									ret := 1.000000 // buy
								if( MFI_High > -37.5551 )
									ret := 0.185484
						if( Money_Flow_Ratio > 4.07921 )
							if( Negative_Money_Flow_Sum <= 6.31247e+06 )
								if( Money_Flow_Ratio <= 6.77789 )
									ret := 0.842105 // buy
								if( Money_Flow_Ratio > 6.77789 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 6.31247e+06 )
								ret := 0.952381 // buy
				if( mf > -0.132655 )
					if( Raw_Money_Flow <= 76292.3 )
						if( Negative_Money_Flow_Sum <= 4.27479e+06 )
							if( ad_mf <= -0.326856 )
								ret := 0.846154 // buy
							if( ad_mf > -0.326856 )
								ret := 0.000000
						if( Negative_Money_Flow_Sum > 4.27479e+06 )
							if( Positive_Money_Flow_Sum <= 6.45849e+07 )
								ret := 0.600000
							if( Positive_Money_Flow_Sum > 6.45849e+07 )
								ret := 1.000000 // buy
					if( Raw_Money_Flow > 76292.3 )
						if( Positive_Money_Flow_Sum <= 1.31247e+06 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 1.31247e+06 )
							if( MFI <= 75.6712 )
								if( Negative_Money_Flow <= 3.43213e+06 )
									ret := 0.143548
								if( Negative_Money_Flow > 3.43213e+06 )
									ret := 1.000000 // buy
							if( MFI > 75.6712 )
								if( mf <= 0.284262 )
									ret := -0.101420
								if( mf > 0.284262 )
									ret := 0.277778
			if( Positive_Money_Flow > 1.8455e+06 )
				if( MFI_Low <= 74.2139 )
					if( Negative_Money_Flow_Sum <= 3.70204e+06 )
						if( Positive_Money_Flow <= 2.23184e+06 )
							if( MFI <= 87.0048 )
								ret := 0.500000
							if( MFI > 87.0048 )
								ret := -0.058824
						if( Positive_Money_Flow > 2.23184e+06 )
							if( Raw_Money_Flow <= 9.06205e+06 )
								if( MFI <= 86.2458 )
									ret := 0.888889 // buy
								if( MFI > 86.2458 )
									ret := 0.603774
							if( Raw_Money_Flow > 9.06205e+06 )
								if( mf <= 0.002761 )
									ret := 0.666667
								if( mf > 0.002761 )
									ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 3.70204e+06 )
						if( Raw_Money_Flow <= 9.76162e+06 )
							if( Negative_Money_Flow_Sum <= 5.88933e+06 )
								if( Positive_Money_Flow_Sum <= 1.62741e+07 )
									ret := 0.561644
								if( Positive_Money_Flow_Sum > 1.62741e+07 )
									ret := 0.012766
							if( Negative_Money_Flow_Sum > 5.88933e+06 )
								if( mf <= 0.097852 )
									ret := 0.161765
								if( mf > 0.097852 )
									ret := 0.687500
						if( Raw_Money_Flow > 9.76162e+06 )
							if( Money_Flow_Ratio <= 8.59038 )
								if( MFI_High <= 8.50573 )
									ret := 0.746269 // buy
								if( MFI_High > 8.50573 )
									ret := -0.181818
							if( Money_Flow_Ratio > 8.59038 )
								if( Typical_Price <= 139.05 )
									ret := 0.681818
								if( Typical_Price > 139.05 )
									ret := 0.954545 // buy
				if( MFI_Low > 74.2139 )
					if( ad <= 38168.4 )
						if( Raw_Money_Flow <= 7.08024e+06 )
							if( Positive_Money_Flow_Sum <= 3.88217e+07 )
								ret := 0.571429
							if( Positive_Money_Flow_Sum > 3.88217e+07 )
								if( Typical_Price <= 130.782 )
									ret := 0.333333
								if( Typical_Price > 130.782 )
									ret := -0.342857
						if( Raw_Money_Flow > 7.08024e+06 )
							if( ad_mf <= -690.647 )
								ret := 1.000000 // buy
							if( ad_mf > -690.647 )
								ret := 0.529412
					if( ad > 38168.4 )
						if( MFI_High <= 17.3407 )
							ret := -0.333333
						if( MFI_High > 17.3407 )
							ret := -0.833333 // sell
		if( Negative_Money_Flow_Sum > 6.89381e+06 )
			if( MFI <= 80.6286 )
				if( Positive_Money_Flow_Sum <= 8.48887e+06 )
					if( Negative_Money_Flow_Sum <= 2.40014e+07 )
						if( Negative_Money_Flow <= 5.31912e+06 )
							if( Money_Flow_Ratio <= 0.441299 )
								if( MFI <= 13.1863 )
									ret := 0.571429
								if( MFI > 13.1863 )
									ret := 0.084286
							if( Money_Flow_Ratio > 0.441299 )
								if( Negative_Money_Flow <= 1.26859e+06 )
									ret := 0.064378
								if( Negative_Money_Flow > 1.26859e+06 )
									ret := -0.388379
						if( Negative_Money_Flow > 5.31912e+06 )
							if( Raw_Money_Flow <= 8.8218e+06 )
								if( mf <= -0.209471 )
									ret := 1.000000 // buy
								if( mf > -0.209471 )
									ret := 0.843750 // buy
							if( Raw_Money_Flow > 8.8218e+06 )
								ret := 0.000000
					if( Negative_Money_Flow_Sum > 2.40014e+07 )
						if( Negative_Money_Flow_Sum <= 6.40631e+07 )
							if( Negative_Money_Flow <= 4.55172e+06 )
								if( ad <= -13003 )
									ret := -0.645390
								if( ad > -13003 )
									ret := -0.270000
							if( Negative_Money_Flow > 4.55172e+06 )
								if( Negative_Money_Flow <= 5.64068e+06 )
									ret := 0.673469
								if( Negative_Money_Flow > 5.64068e+06 )
									ret := -0.194690
						if( Negative_Money_Flow_Sum > 6.40631e+07 )
							if( ad <= 4856.9 )
								if( Negative_Money_Flow <= 3.15615e+06 )
									ret := 0.663366
								if( Negative_Money_Flow > 3.15615e+06 )
									ret := 0.088235
							if( ad > 4856.9 )
								if( mf <= -0.260272 )
									ret := -1.000000 // sell
								if( mf > -0.260272 )
									ret := -0.416667
				if( Positive_Money_Flow_Sum > 8.48887e+06 )
					if( Negative_Money_Flow <= 1.02597e+07 )
						if( Raw_Money_Flow <= 87596.2 )
							if( Typical_Price <= 144.225 )
								if( Positive_Money_Flow_Sum <= 4.3725e+07 )
									ret := -0.176190
								if( Positive_Money_Flow_Sum > 4.3725e+07 )
									ret := -0.485507
							if( Typical_Price > 144.225 )
								if( MFI <= 27.9104 )
									ret := 1.000000 // buy
								if( MFI > 27.9104 )
									ret := 0.523810
						if( Raw_Money_Flow > 87596.2 )
							if( Raw_Money_Flow <= 6.48711e+06 )
								if( MFI_Low <= -9.87652 )
									ret := -0.485714
								if( MFI_Low > -9.87652 )
									ret := 0.060730
							if( Raw_Money_Flow > 6.48711e+06 )
								if( Negative_Money_Flow_Sum <= 2.81889e+07 )
									ret := 0.033613
								if( Negative_Money_Flow_Sum > 2.81889e+07 )
									ret := -0.166341
					if( Negative_Money_Flow > 1.02597e+07 )
						if( ad_mf <= 0.005172 )
							if( Negative_Money_Flow_Sum <= 9.53103e+07 )
								if( MFI <= 26.9984 )
									ret := 0.597938
								if( MFI > 26.9984 )
									ret := 0.267544
							if( Negative_Money_Flow_Sum > 9.53103e+07 )
								if( ad_mf <= -42754.8 )
									ret := -0.611111
								if( ad_mf > -42754.8 )
									ret := -0.166667
						if( ad_mf > 0.005172 )
							if( Typical_Price <= 118.568 )
								ret := 0.925926 // buy
							if( Typical_Price > 118.568 )
								if( Positive_Money_Flow_Sum <= 1.91143e+07 )
									ret := -0.227053
								if( Positive_Money_Flow_Sum > 1.91143e+07 )
									ret := 0.149254
			if( MFI > 80.6286 )
				if( Positive_Money_Flow_Sum <= 1.70822e+08 )
					if( MFI <= 85.7074 )
						if( MFI_High <= 2.26996 )
							if( ad <= -12.103 )
								if( MFI <= 80.7151 )
									ret := -0.769231 // sell
								if( MFI > 80.7151 )
									ret := 0.213115
							if( ad > -12.103 )
								if( mf <= -0.044128 )
									ret := 1.000000 // buy
								if( mf > -0.044128 )
									ret := -0.390244
						if( MFI_High > 2.26996 )
							if( Raw_Money_Flow <= 365258 )
								if( Raw_Money_Flow <= 14567.3 )
									ret := -0.857143 // sell
								if( Raw_Money_Flow > 14567.3 )
									ret := -0.984127 // sell
							if( Raw_Money_Flow > 365258 )
								if( ad_mf <= -14677.4 )
									ret := -0.731707 // sell
								if( ad_mf > -14677.4 )
									ret := -0.306069
					if( MFI > 85.7074 )
						if( MFI_Low <= 72.0248 )
							if( Typical_Price <= 134.92 )
								if( Money_Flow_Ratio <= 8.44566 )
									ret := 0.152047
								if( Money_Flow_Ratio > 8.44566 )
									ret := 0.794118 // buy
							if( Typical_Price > 134.92 )
								if( Negative_Money_Flow <= 1.96062e+06 )
									ret := 0.047619
								if( Negative_Money_Flow > 1.96062e+06 )
									ret := -0.317460
						if( MFI_Low > 72.0248 )
							if( Raw_Money_Flow <= 377000 )
								ret := 0.818182 // buy
							if( Raw_Money_Flow > 377000 )
								if( Money_Flow_Ratio <= 14.3076 )
									ret := -0.369565
								if( Money_Flow_Ratio > 14.3076 )
									ret := -0.838710 // sell
				if( Positive_Money_Flow_Sum > 1.70822e+08 )
					if( Negative_Money_Flow_Sum <= 9.04134e+06 )
						ret := -0.250000
					if( Negative_Money_Flow_Sum > 9.04134e+06 )
						if( Positive_Money_Flow <= 179384 )
							if( MFI_High <= 16.7923 )
								if( Raw_Money_Flow <= 2.40055e+06 )
									ret := -0.187500
								if( Raw_Money_Flow > 2.40055e+06 )
									ret := 0.750000 // buy
							if( MFI_High > 16.7923 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow > 179384 )
							if( MFI_Low <= 74.3466 )
								if( Typical_Price <= 140.956 )
									ret := 1.000000 // buy
								if( Typical_Price > 140.956 )
									ret := 0.909091 // buy
							if( MFI_Low > 74.3466 )
								ret := 0.736842 // buy
	if( Typical_Price > 145.198 )
		if( Positive_Money_Flow_Sum <= 1.06027e+08 )
			if( Negative_Money_Flow <= 6.34196e+06 )
				if( MFI_High <= 19.3256 )
					if( ad <= 97821.7 )
						if( mf <= 0.214547 )
							if( Positive_Money_Flow_Sum <= 4.42408e+07 )
								if( mf <= 0.005402 )
									ret := -0.003622
								if( mf > 0.005402 )
									ret := -0.045645
							if( Positive_Money_Flow_Sum > 4.42408e+07 )
								if( MFI_High <= -53.0306 )
									ret := 0.727273 // buy
								if( MFI_High > -53.0306 )
									ret := -0.089842
						if( mf > 0.214547 )
							if( Negative_Money_Flow_Sum <= 6.89939e+07 )
								if( Raw_Money_Flow <= 1.80927e+06 )
									ret := 0.117053
								if( Raw_Money_Flow > 1.80927e+06 )
									ret := 0.000303
							if( Negative_Money_Flow_Sum > 6.89939e+07 )
								if( Money_Flow_Ratio <= 0.694829 )
									ret := -0.089888
								if( Money_Flow_Ratio > 0.694829 )
									ret := -0.780000 // sell
					if( ad > 97821.7 )
						if( Typical_Price <= 155.078 )
							if( Typical_Price <= 148.217 )
								ret := -0.692308
							if( Typical_Price > 148.217 )
								ret := 0.388889
						if( Typical_Price > 155.078 )
							if( Positive_Money_Flow_Sum <= 7.64951e+07 )
								if( MFI <= 40.2694 )
									ret := 0.000000
								if( MFI > 40.2694 )
									ret := -0.780952 // sell
							if( Positive_Money_Flow_Sum > 7.64951e+07 )
								ret := -0.050000
				if( MFI_High > 19.3256 )
					if( Typical_Price <= 186.244 )
						ret := 1.000000 // buy
					if( Typical_Price > 186.244 )
						ret := 0.818182 // buy
			if( Negative_Money_Flow > 6.34196e+06 )
				if( ad_mf <= 164788 )
					if( ad_mf <= -156841 )
						if( MFI <= 12.3378 )
							if( Typical_Price <= 195.8 )
								if( Money_Flow_Ratio <= 0.063164 )
									ret := -0.466667
								if( Money_Flow_Ratio > 0.063164 )
									ret := -0.875000 // sell
							if( Typical_Price > 195.8 )
								ret := -1.000000 // sell
						if( MFI > 12.3378 )
							if( Negative_Money_Flow_Sum <= 7.61557e+07 )
								ret := -0.611111
							if( Negative_Money_Flow_Sum > 7.61557e+07 )
								ret := 0.777778 // buy
					if( ad_mf > -156841 )
						if( Negative_Money_Flow <= 3.20049e+07 )
							if( Negative_Money_Flow <= 6.3575e+06 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow > 6.3575e+06 )
								if( Negative_Money_Flow_Sum <= 3.61343e+07 )
									ret := -0.000505
								if( Negative_Money_Flow_Sum > 3.61343e+07 )
									ret := 0.221990
						if( Negative_Money_Flow > 3.20049e+07 )
							if( Raw_Money_Flow <= 4.0226e+07 )
								if( Typical_Price <= 211.621 )
									ret := -0.523256
								if( Typical_Price > 211.621 )
									ret := 0.615385
							if( Raw_Money_Flow > 4.0226e+07 )
								if( Typical_Price <= 177.584 )
									ret := 0.690265
								if( Typical_Price > 177.584 )
									ret := -0.291262
				if( ad_mf > 164788 )
					if( Money_Flow_Ratio <= 0.156883 )
						if( MFI <= 7.51682 )
							ret := -0.625000
						if( MFI > 7.51682 )
							ret := -1.000000 // sell
					if( Money_Flow_Ratio > 0.156883 )
						ret := 0.181818
		if( Positive_Money_Flow_Sum > 1.06027e+08 )
			if( Negative_Money_Flow_Sum <= 2.01351e+08 )
				if( Typical_Price <= 200.287 )
					if( Typical_Price <= 196.935 )
						if( Raw_Money_Flow <= 5.83079e+06 )
							if( MFI <= 95.405 )
								if( Typical_Price <= 191.038 )
									ret := 0.125786
								if( Typical_Price > 191.038 )
									ret := -0.947368 // sell
							if( MFI > 95.405 )
								if( Negative_Money_Flow <= 2.02639e+06 )
									ret := -0.662791
								if( Negative_Money_Flow > 2.02639e+06 )
									ret := 0.260870
						if( Raw_Money_Flow > 5.83079e+06 )
							if( Raw_Money_Flow <= 8.16393e+07 )
								if( ad <= -7068.89 )
									ret := -0.926471 // sell
								if( ad > -7068.89 )
									ret := -0.519231
							if( Raw_Money_Flow > 8.16393e+07 )
								if( Money_Flow_Ratio <= 3.58488 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 3.58488 )
									ret := 0.395833
					if( Typical_Price > 196.935 )
						if( MFI_Low <= 45.9595 )
							if( Negative_Money_Flow_Sum <= 1.45645e+08 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 1.45645e+08 )
								ret := 0.750000 // buy
						if( MFI_Low > 45.9595 )
							if( Raw_Money_Flow <= 2.06288e+06 )
								ret := -0.230769
							if( Raw_Money_Flow > 2.06288e+06 )
								if( Typical_Price <= 198.422 )
									ret := 1.000000 // buy
								if( Typical_Price > 198.422 )
									ret := -0.187500
				if( Typical_Price > 200.287 )
					if( Negative_Money_Flow_Sum <= 2.481e+07 )
						if( Positive_Money_Flow_Sum <= 1.36002e+08 )
							if( MFI_High <= 4.28159 )
								if( Negative_Money_Flow_Sum <= 2.2875e+07 )
									ret := -0.818182 // sell
								if( Negative_Money_Flow_Sum > 2.2875e+07 )
									ret := -1.000000 // sell
							if( MFI_High > 4.28159 )
								if( Typical_Price <= 203.772 )
									ret := 0.000000
								if( Typical_Price > 203.772 )
									ret := -0.744681 // sell
						if( Positive_Money_Flow_Sum > 1.36002e+08 )
							ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 2.481e+07 )
						if( Positive_Money_Flow_Sum <= 1.21766e+08 )
							if( MFI_Low <= 49.0292 )
								ret := -1.000000 // sell
							if( MFI_Low > 49.0292 )
								if( Positive_Money_Flow <= 7.05047e+06 )
									ret := 0.355556
								if( Positive_Money_Flow > 7.05047e+06 )
									ret := -0.555556
						if( Positive_Money_Flow_Sum > 1.21766e+08 )
							if( Positive_Money_Flow <= 5.26217e+06 )
								if( Raw_Money_Flow <= 1.39918e+06 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 1.39918e+06 )
									ret := -0.533333
							if( Positive_Money_Flow > 5.26217e+06 )
								if( Positive_Money_Flow_Sum <= 1.74552e+08 )
									ret := -0.888889 // sell
								if( Positive_Money_Flow_Sum > 1.74552e+08 )
									ret := -1.000000 // sell
			if( Negative_Money_Flow_Sum > 2.01351e+08 )
				if( Positive_Money_Flow <= 4.78043e+06 )
					ret := 0.000000
				if( Positive_Money_Flow > 4.78043e+06 )
					if( Raw_Money_Flow <= 2.47455e+07 )
						ret := 1.000000 // buy
					if( Raw_Money_Flow > 2.47455e+07 )
						ret := 0.818182 // buy
	
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
float op_operation = decision_tree_0_FFIV_15Min_3a9b69b2(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


