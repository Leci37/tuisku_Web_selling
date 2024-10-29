//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: FFIV_15Min_2BM0_085d9e8d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_FFIV_15Min_2BM0_085d9e8d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_FFIV_15Min_085d9e8d(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bbp <= -0.796047 )
		if( Raw_Money_Flow <= 4.18942e+06 )
			if( Typical_Price <= 116.835 )
				if( Positive_Money_Flow_Sum <= 2.76428e+07 )
					if( MFI <= 20.4258 )
						if( Money_Flow_Ratio <= 0.219619 )
							ret := 0.250000
						if( Money_Flow_Ratio > 0.219619 )
							if( Typical_Price <= 105.343 )
								ret := 1.000000 // buy
							if( Typical_Price > 105.343 )
								ret := 0.666667
					if( MFI > 20.4258 )
						if( bearPower <= -1.47282 )
							if( Negative_Money_Flow_Sum <= 3.38868e+07 )
								if( Negative_Money_Flow_Sum <= 2.21358e+07 )
									ret := -0.228571
								if( Negative_Money_Flow_Sum > 2.21358e+07 )
									ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 3.38868e+07 )
								if( bullPower <= -1.29321 )
									ret := 0.000000
								if( bullPower > -1.29321 )
									ret := -0.548387
						if( bearPower > -1.47282 )
							if( Typical_Price <= 99.0542 )
								ret := -0.250000
							if( Typical_Price > 99.0542 )
								if( bearPower <= -1.07837 )
									ret := 0.735294 // buy
								if( bearPower > -1.07837 )
									ret := 0.243243
				if( Positive_Money_Flow_Sum > 2.76428e+07 )
					if( Typical_Price <= 111.255 )
						if( MFI <= 76.8718 )
							ret := 1.000000 // buy
						if( MFI > 76.8718 )
							ret := 0.500000
					if( Typical_Price > 111.255 )
						if( Typical_Price <= 114.232 )
							ret := -0.473684
						if( Typical_Price > 114.232 )
							if( MFI_High <= -11.6419 )
								ret := 0.272727
							if( MFI_High > -11.6419 )
								ret := 0.882353 // buy
			if( Typical_Price > 116.835 )
				if( bullPower <= 0.521885 )
					if( Raw_Money_Flow <= 3.56044e+06 )
						if( Typical_Price <= 224.06 )
							if( Negative_Money_Flow_Sum <= 2.75974e+08 )
								if( MFI <= 68.2905 )
									ret := 0.026273
								if( MFI > 68.2905 )
									ret := -0.097686
							if( Negative_Money_Flow_Sum > 2.75974e+08 )
								ret := 1.000000 // buy
						if( Typical_Price > 224.06 )
							if( bbm <= 0.375 )
								if( bearPower <= -0.992818 )
									ret := 0.500000
								if( bearPower > -0.992818 )
									ret := -0.090909
							if( bbm > 0.375 )
								if( Negative_Money_Flow_Sum <= 1.58051e+07 )
									ret := 0.186047
								if( Negative_Money_Flow_Sum > 1.58051e+07 )
									ret := -0.323529
					if( Raw_Money_Flow > 3.56044e+06 )
						if( Positive_Money_Flow <= 4.07981e+06 )
							if( MFI <= 76.5269 )
								if( MFI <= 59.0208 )
									ret := -0.207237
								if( MFI > 59.0208 )
									ret := 0.130000
							if( MFI > 76.5269 )
								if( Negative_Money_Flow <= 3.69194e+06 )
									ret := -0.153846
								if( Negative_Money_Flow > 3.69194e+06 )
									ret := -0.774194 // sell
						if( Positive_Money_Flow > 4.07981e+06 )
							if( Positive_Money_Flow <= 4.15056e+06 )
								if( Raw_Money_Flow <= 4.1182e+06 )
									ret := 0.434783
								if( Raw_Money_Flow > 4.1182e+06 )
									ret := 0.761905 // buy
							if( Positive_Money_Flow > 4.15056e+06 )
								ret := -0.416667
				if( bullPower > 0.521885 )
					if( MFI_Low <= 26.7467 )
						if( bearPower <= -1.80295 )
							if( Raw_Money_Flow <= 929767 )
								ret := 0.700000 // buy
							if( Raw_Money_Flow > 929767 )
								ret := 0.956522 // buy
						if( bearPower > -1.80295 )
							ret := 0.625000
					if( MFI_Low > 26.7467 )
						ret := 0.434783
		if( Raw_Money_Flow > 4.18942e+06 )
			if( Negative_Money_Flow_Sum <= 5.78049e+07 )
				if( Negative_Money_Flow_Sum <= 5.32551e+07 )
					if( Negative_Money_Flow_Sum <= 1.25047e+07 )
						if( Negative_Money_Flow_Sum <= 9.47868e+06 )
							if( Positive_Money_Flow <= 6.73401e+06 )
								ret := 0.941176 // buy
							if( Positive_Money_Flow > 6.73401e+06 )
								if( Raw_Money_Flow <= 1.26548e+07 )
									ret := 0.384615
								if( Raw_Money_Flow > 1.26548e+07 )
									ret := 0.900000 // buy
						if( Negative_Money_Flow_Sum > 9.47868e+06 )
							if( MFI <= 44.512 )
								if( Money_Flow_Ratio <= 0.477333 )
									ret := 0.250000
								if( Money_Flow_Ratio > 0.477333 )
									ret := 1.000000 // buy
							if( MFI > 44.512 )
								if( Typical_Price <= 173.765 )
									ret := 0.000000
								if( Typical_Price > 173.765 )
									ret := 0.769231 // buy
					if( Negative_Money_Flow_Sum > 1.25047e+07 )
						if( Typical_Price <= 170.339 )
							if( Negative_Money_Flow <= 2.69901e+07 )
								if( bearPower <= -2.62666 )
									ret := 0.270968
								if( bearPower > -2.62666 )
									ret := 0.018782
							if( Negative_Money_Flow > 2.69901e+07 )
								ret := -1.000000 // sell
						if( Typical_Price > 170.339 )
							if( MFI <= 69.8766 )
								if( Negative_Money_Flow <= 9.21895e+06 )
									ret := 0.116959
								if( Negative_Money_Flow > 9.21895e+06 )
									ret := 0.560510
							if( MFI > 69.8766 )
								if( Positive_Money_Flow_Sum <= 8.73032e+07 )
									ret := -0.637931
								if( Positive_Money_Flow_Sum > 8.73032e+07 )
									ret := 0.080000
				if( Negative_Money_Flow_Sum > 5.32551e+07 )
					if( Negative_Money_Flow <= 1.34916e+07 )
						if( Positive_Money_Flow <= 9.62836e+06 )
							if( bullPower <= 0.02303 )
								if( Positive_Money_Flow <= 2.2068e+06 )
									ret := -0.354545
								if( Positive_Money_Flow > 2.2068e+06 )
									ret := -0.928571 // sell
							if( bullPower > 0.02303 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow > 9.62836e+06 )
							if( Raw_Money_Flow <= 1.30854e+07 )
								ret := 0.538462
							if( Raw_Money_Flow > 1.30854e+07 )
								ret := -0.583333
					if( Negative_Money_Flow > 1.34916e+07 )
						if( bbm <= 0.699087 )
							if( Raw_Money_Flow <= 2.13284e+07 )
								ret := 0.846154 // buy
							if( Raw_Money_Flow > 2.13284e+07 )
								ret := 0.444444
						if( bbm > 0.699087 )
							if( Typical_Price <= 156.281 )
								ret := -0.500000
							if( Typical_Price > 156.281 )
								ret := 0.235294
			if( Negative_Money_Flow_Sum > 5.78049e+07 )
				if( Positive_Money_Flow_Sum <= 4.55324e+06 )
					if( Negative_Money_Flow_Sum <= 1.16041e+08 )
						if( Positive_Money_Flow_Sum <= 1.49739e+06 )
							ret := 0.363636
						if( Positive_Money_Flow_Sum > 1.49739e+06 )
							if( MFI <= 5.59261 )
								if( bbp <= -2.53616 )
									ret := -0.711538 // sell
								if( bbp > -2.53616 )
									ret := -0.290323
							if( MFI > 5.59261 )
								ret := 0.150000
					if( Negative_Money_Flow_Sum > 1.16041e+08 )
						if( bbp <= -5.3098 )
							if( Positive_Money_Flow_Sum <= 1.82287e+06 )
								ret := 0.500000
							if( Positive_Money_Flow_Sum > 1.82287e+06 )
								ret := 1.000000 // buy
						if( bbp > -5.3098 )
							ret := 0.333333
				if( Positive_Money_Flow_Sum > 4.55324e+06 )
					if( bullPower <= -4.52612 )
						if( bearPower <= -8.86904 )
							ret := -0.625000
						if( bearPower > -8.86904 )
							ret := -1.000000 // sell
					if( bullPower > -4.52612 )
						if( bullPower <= -0.072905 )
							if( bullPower <= -0.453577 )
								if( Typical_Price <= 169.905 )
									ret := 0.378049
								if( Typical_Price > 169.905 )
									ret := 0.060827
							if( bullPower > -0.453577 )
								if( Positive_Money_Flow_Sum <= 1.76395e+07 )
									ret := 0.833333 // buy
								if( Positive_Money_Flow_Sum > 1.76395e+07 )
									ret := 0.374603
						if( bullPower > -0.072905 )
							if( Positive_Money_Flow_Sum <= 3.62201e+07 )
								if( MFI <= 17.3641 )
									ret := -0.617021
								if( MFI > 17.3641 )
									ret := -0.011905
							if( Positive_Money_Flow_Sum > 3.62201e+07 )
								if( MFI <= 58.4255 )
									ret := 0.396552
								if( MFI > 58.4255 )
									ret := -0.833333 // sell
	if( bbp > -0.796047 )
		if( bbm <= 1.75133 )
			if( MFI <= 64.5396 )
				if( Negative_Money_Flow_Sum <= 9.46158e+07 )
					if( Positive_Money_Flow <= 9.04594e+06 )
						if( bbp <= 3.17766 )
							if( bearPower <= -0.581604 )
								if( bullPower <= 0.03068 )
									ret := -0.025791
								if( bullPower > 0.03068 )
									ret := -0.170585
							if( bearPower > -0.581604 )
								if( Typical_Price <= 144.587 )
									ret := 0.062489
								if( Typical_Price > 144.587 )
									ret := -0.058912
						if( bbp > 3.17766 )
							if( Raw_Money_Flow <= 239179 )
								if( Typical_Price <= 190.583 )
									ret := -0.788732 // sell
								if( Typical_Price > 190.583 )
									ret := 0.153846
							if( Raw_Money_Flow > 239179 )
								if( MFI_High <= -40.3625 )
									ret := 0.047337
								if( MFI_High > -40.3625 )
									ret := -0.318519
					if( Positive_Money_Flow > 9.04594e+06 )
						if( MFI_High <= -33.0079 )
							if( bearPower <= -0.75019 )
								ret := -0.625000
							if( bearPower > -0.75019 )
								if( Raw_Money_Flow <= 1.0193e+07 )
									ret := -0.562500
								if( Raw_Money_Flow > 1.0193e+07 )
									ret := 0.416667
						if( MFI_High > -33.0079 )
							if( Positive_Money_Flow <= 2.80546e+07 )
								if( Negative_Money_Flow_Sum <= 1.38861e+07 )
									ret := 0.256410
								if( Negative_Money_Flow_Sum > 1.38861e+07 )
									ret := -0.409396
							if( Positive_Money_Flow > 2.80546e+07 )
								if( MFI_High <= -19.3038 )
									ret := 0.763636 // buy
								if( MFI_High > -19.3038 )
									ret := -0.034483
				if( Negative_Money_Flow_Sum > 9.46158e+07 )
					if( Raw_Money_Flow <= 867116 )
						if( Money_Flow_Ratio <= 0.275721 )
							if( bbp <= 0.716548 )
								if( MFI <= 11.2865 )
									ret := 0.700000 // buy
								if( MFI > 11.2865 )
									ret := 0.965517 // buy
							if( bbp > 0.716548 )
								if( Negative_Money_Flow_Sum <= 1.02441e+08 )
									ret := 0.642857
								if( Negative_Money_Flow_Sum > 1.02441e+08 )
									ret := -0.176471
						if( Money_Flow_Ratio > 0.275721 )
							if( bbp <= 0.4038 )
								ret := -0.529412
							if( bbp > 0.4038 )
								ret := 0.714286 // buy
					if( Raw_Money_Flow > 867116 )
						if( bbm <= 0.005088 )
							if( MFI <= 13.2758 )
								ret := 0.950000 // buy
							if( MFI > 13.2758 )
								if( MFI_High <= -50.6711 )
									ret := -0.058824
								if( MFI_High > -50.6711 )
									ret := 0.909091 // buy
						if( bbm > 0.005088 )
							if( Negative_Money_Flow_Sum <= 9.71604e+07 )
								if( MFI_High <= -69.6478 )
									ret := -0.500000
								if( MFI_High > -69.6478 )
									ret := 0.636364
							if( Negative_Money_Flow_Sum > 9.71604e+07 )
								if( MFI_High <= -49.4337 )
									ret := 0.076358
								if( MFI_High > -49.4337 )
									ret := -0.360656
			if( MFI > 64.5396 )
				if( Typical_Price <= 144.772 )
					if( MFI_Low <= 65.9798 )
						if( Positive_Money_Flow <= 1.54616e+07 )
							if( MFI_High <= -9.91734 )
								if( bbm <= 0.399872 )
									ret := 0.068100
								if( bbm > 0.399872 )
									ret := 0.248512
							if( MFI_High > -9.91734 )
								if( Negative_Money_Flow_Sum <= 7.51216e+06 )
									ret := 0.150383
								if( Negative_Money_Flow_Sum > 7.51216e+06 )
									ret := -0.053051
						if( Positive_Money_Flow > 1.54616e+07 )
							if( Positive_Money_Flow <= 5.11294e+07 )
								if( bbp <= 1.3075 )
									ret := -0.237762
								if( bbp > 1.3075 )
									ret := -0.720000 // sell
							if( Positive_Money_Flow > 5.11294e+07 )
								ret := 0.818182 // buy
					if( MFI_Low > 65.9798 )
						if( Money_Flow_Ratio <= 9.17704 )
							if( bbm <= 0.635101 )
								if( Positive_Money_Flow <= 6.26224e+06 )
									ret := 0.184466
								if( Positive_Money_Flow > 6.26224e+06 )
									ret := 0.621951
							if( bbm > 0.635101 )
								if( Positive_Money_Flow <= 2.35465e+06 )
									ret := 0.548387
								if( Positive_Money_Flow > 2.35465e+06 )
									ret := 0.876289 // buy
						if( Money_Flow_Ratio > 9.17704 )
							if( Negative_Money_Flow_Sum <= 1.37876e+07 )
								if( Money_Flow_Ratio <= 65.8107 )
									ret := 0.154341
								if( Money_Flow_Ratio > 65.8107 )
									ret := -0.500000
							if( Negative_Money_Flow_Sum > 1.37876e+07 )
								if( bullPower <= 0.743627 )
									ret := -0.538462
								if( bullPower > 0.743627 )
									ret := -1.000000 // sell
				if( Typical_Price > 144.772 )
					if( MFI_Low <= 56.1898 )
						if( Negative_Money_Flow_Sum <= 2.22577e+07 )
							if( Positive_Money_Flow_Sum <= 3.26948e+07 )
								if( bbm <= 0.018408 )
									ret := 0.568627
								if( bbm > 0.018408 )
									ret := 0.040490
							if( Positive_Money_Flow_Sum > 3.26948e+07 )
								if( Raw_Money_Flow <= 1.68188e+07 )
									ret := -0.110538
								if( Raw_Money_Flow > 1.68188e+07 )
									ret := -0.451220
						if( Negative_Money_Flow_Sum > 2.22577e+07 )
							if( bbm <= 0.794871 )
								if( bullPower <= -0.131558 )
									ret := -0.488372
								if( bullPower > -0.131558 )
									ret := 0.166667
							if( bbm > 0.794871 )
								if( Positive_Money_Flow_Sum <= 1.09556e+08 )
									ret := 0.419903
								if( Positive_Money_Flow_Sum > 1.09556e+08 )
									ret := -0.264151
					if( MFI_Low > 56.1898 )
						if( Positive_Money_Flow_Sum <= 2.17827e+07 )
							if( bullPower <= 1.96111 )
								if( bearPower <= 0.55021 )
									ret := 0.061329
								if( bearPower > 0.55021 )
									ret := 0.344186
							if( bullPower > 1.96111 )
								ret := -0.863636 // sell
						if( Positive_Money_Flow_Sum > 2.17827e+07 )
							if( Typical_Price <= 207.685 )
								if( Raw_Money_Flow <= 77453 )
									ret := -0.562814
								if( Raw_Money_Flow > 77453 )
									ret := -0.021040
							if( Typical_Price > 207.685 )
								if( bbp <= 2.32844 )
									ret := -0.164589
								if( bbp > 2.32844 )
									ret := -0.376712
		if( bbm > 1.75133 )
			if( Positive_Money_Flow_Sum <= 2.54551e+07 )
				if( Typical_Price <= 100.532 )
					ret := 0.692308
				if( Typical_Price > 100.532 )
					if( Negative_Money_Flow_Sum <= 1.04252e+08 )
						if( Positive_Money_Flow_Sum <= 1.62407e+07 )
							if( MFI <= 48.4753 )
								if( MFI_Low <= -13.5382 )
									ret := -1.000000 // sell
								if( MFI_Low > -13.5382 )
									ret := 0.018519
							if( MFI > 48.4753 )
								if( MFI <= 75.2956 )
									ret := -1.000000 // sell
								if( MFI > 75.2956 )
									ret := -0.545455
						if( Positive_Money_Flow_Sum > 1.62407e+07 )
							if( MFI_Low <= 29.3987 )
								if( Negative_Money_Flow_Sum <= 6.02969e+07 )
									ret := -0.616438
								if( Negative_Money_Flow_Sum > 6.02969e+07 )
									ret := -0.909091 // sell
							if( MFI_Low > 29.3987 )
								if( Positive_Money_Flow <= 3.39248e+06 )
									ret := 0.142857
								if( Positive_Money_Flow > 3.39248e+06 )
									ret := -0.625000
					if( Negative_Money_Flow_Sum > 1.04252e+08 )
						if( bbm <= 1.97657 )
							ret := 0.000000
						if( bbm > 1.97657 )
							ret := 0.529412
			if( Positive_Money_Flow_Sum > 2.54551e+07 )
				if( Typical_Price <= 205.084 )
					if( Positive_Money_Flow <= 5.63456e+06 )
						if( MFI_High <= 5.55051 )
							if( Typical_Price <= 126.363 )
								if( MFI_Low <= 43.9003 )
									ret := -0.285714
								if( MFI_Low > 43.9003 )
									ret := -0.950000 // sell
							if( Typical_Price > 126.363 )
								if( Typical_Price <= 144.06 )
									ret := 0.575342
								if( Typical_Price > 144.06 )
									ret := 0.024038
						if( MFI_High > 5.55051 )
							if( bearPower <= -0.928418 )
								ret := -0.153846
							if( bearPower > -0.928418 )
								if( Raw_Money_Flow <= 3.98542e+06 )
									ret := 0.589744
								if( Raw_Money_Flow > 3.98542e+06 )
									ret := 1.000000 // buy
					if( Positive_Money_Flow > 5.63456e+06 )
						if( MFI_Low <= 71.401 )
							if( bullPower <= 5.34339 )
								if( Money_Flow_Ratio <= 8.84886 )
									ret := -0.130081
								if( Money_Flow_Ratio > 8.84886 )
									ret := -0.928571 // sell
							if( bullPower > 5.34339 )
								if( MFI_Low <= 41.0756 )
									ret := -1.000000 // sell
								if( MFI_Low > 41.0756 )
									ret := -0.650000
						if( MFI_Low > 71.401 )
							if( Money_Flow_Ratio <= 102.805 )
								if( Negative_Money_Flow_Sum <= 7.17892e+06 )
									ret := 0.735849 // buy
								if( Negative_Money_Flow_Sum > 7.17892e+06 )
									ret := -0.888889 // sell
							if( Money_Flow_Ratio > 102.805 )
								ret := -1.000000 // sell
				if( Typical_Price > 205.084 )
					if( Raw_Money_Flow <= 2.60231e+06 )
						ret := 0.555556
					if( Raw_Money_Flow > 2.60231e+06 )
						if( bearPower <= -1.39352 )
							ret := 0.555556
						if( bearPower > -1.39352 )
							if( Raw_Money_Flow <= 8.71717e+06 )
								if( Money_Flow_Ratio <= 1.36913 )
									ret := -0.813953 // sell
								if( Money_Flow_Ratio > 1.36913 )
									ret := -0.052632
							if( Raw_Money_Flow > 8.71717e+06 )
								if( MFI <= 54.6511 )
									ret := -0.500000
								if( MFI > 54.6511 )
									ret := -0.771084 // sell
	
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
float op_operation = decision_tree_0_FFIV_15Min_085d9e8d(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


