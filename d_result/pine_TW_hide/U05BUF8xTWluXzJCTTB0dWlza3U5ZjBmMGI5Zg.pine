//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: SNAP_1Min_2BM0_9f0f0b9f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_1Min_2BM0_9f0f0b9f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_1Min_9f0f0b9f(bbm, bearPower, bbp, bullPower, BBPower_Color, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bearPower <= 0.002063 )
		if( bbm <= 0.0049 )
			if( bbp <= -0.022775 )
				if( Negative_Money_Flow <= 0.477409 )
					if( Typical_Price <= 14.4432 )
						if( bbm <= 0.000204 )
							if( Negative_Money_Flow_Sum <= 184939 )
								if( Positive_Money_Flow_Sum <= 22854.3 )
									ret := 0.695238
								if( Positive_Money_Flow_Sum > 22854.3 )
									ret := 0.320197
							if( Negative_Money_Flow_Sum > 184939 )
								if( bearPower <= -0.034141 )
									ret := 0.517241
								if( bearPower > -0.034141 )
									ret := 0.000000
						if( bbm > 0.000204 )
							if( MFI_High <= -26.0485 )
								if( Negative_Money_Flow_Sum <= 411682 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 411682 )
									ret := 0.500000
							if( MFI_High > -26.0485 )
								if( MFI_Low <= 55.8951 )
									ret := -0.250000
								if( MFI_Low > 55.8951 )
									ret := 0.750000 // buy
					if( Typical_Price > 14.4432 )
						if( bullPower <= -0.023045 )
							if( Negative_Money_Flow_Sum <= 36236.8 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 36236.8 )
								if( Positive_Money_Flow <= 4800.87 )
									ret := 0.113402
								if( Positive_Money_Flow > 4800.87 )
									ret := 0.540541
						if( bullPower > -0.023045 )
							if( Positive_Money_Flow_Sum <= 6580.99 )
								ret := -0.857143 // sell
							if( Positive_Money_Flow_Sum > 6580.99 )
								if( MFI_Low <= 39.4801 )
									ret := -0.058442
								if( MFI_Low > 39.4801 )
									ret := 0.240000
				if( Negative_Money_Flow > 0.477409 )
					if( bbp <= -0.095936 )
						if( Typical_Price <= 16.23 )
							if( Positive_Money_Flow_Sum <= 377735 )
								if( MFI_High <= -76.6174 )
									ret := 0.200000
								if( MFI_High > -76.6174 )
									ret := 0.877660 // buy
							if( Positive_Money_Flow_Sum > 377735 )
								if( MFI_High <= -7.0837 )
									ret := 0.000000
								if( MFI_High > -7.0837 )
									ret := 0.846154 // buy
						if( Typical_Price > 16.23 )
							if( MFI <= 40.4291 )
								if( MFI_High <= -65.6619 )
									ret := 1.000000 // buy
								if( MFI_High > -65.6619 )
									ret := -0.400000
							if( MFI > 40.4291 )
								if( bullPower <= -0.059764 )
									ret := 0.600000
								if( bullPower > -0.059764 )
									ret := 1.000000 // buy
					if( bbp > -0.095936 )
						if( Negative_Money_Flow_Sum <= 178524 )
							if( Negative_Money_Flow <= 12116.2 )
								if( Money_Flow_Ratio <= 0.014118 )
									ret := -0.800000 // sell
								if( Money_Flow_Ratio > 0.014118 )
									ret := 0.619011
							if( Negative_Money_Flow > 12116.2 )
								if( Raw_Money_Flow <= 30119.9 )
									ret := 0.393939
								if( Raw_Money_Flow > 30119.9 )
									ret := 0.000000
						if( Negative_Money_Flow_Sum > 178524 )
							if( Positive_Money_Flow_Sum <= 8986.77 )
								if( bbp <= -0.071731 )
									ret := 0.000000
								if( bbp > -0.071731 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 8986.77 )
								if( Typical_Price <= 15.8766 )
									ret := 0.401434
								if( Typical_Price > 15.8766 )
									ret := 0.092784
			if( bbp > -0.022775 )
				if( Negative_Money_Flow <= 58.889 )
					if( bearPower <= -0.001347 )
						if( Negative_Money_Flow_Sum <= 168763 )
							if( Money_Flow_Ratio <= 1.05673 )
								if( MFI <= 41.6166 )
									ret := 0.169620
								if( MFI > 41.6166 )
									ret := 0.535714
							if( Money_Flow_Ratio > 1.05673 )
								if( bbm <= 0.002999 )
									ret := 0.074830
								if( bbm > 0.002999 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 168763 )
							if( MFI_High <= 11.5306 )
								if( Positive_Money_Flow <= 85174.2 )
									ret := 0.043702
								if( Positive_Money_Flow > 85174.2 )
									ret := -0.280000
							if( MFI_High > 11.5306 )
								if( bearPower <= -0.006055 )
									ret := -1.000000 // sell
								if( bearPower > -0.006055 )
									ret := -0.200000
					if( bearPower > -0.001347 )
						if( Raw_Money_Flow <= 133877 )
							if( Raw_Money_Flow <= 1077.5 )
								if( Positive_Money_Flow_Sum <= 221250 )
									ret := -0.259259
								if( Positive_Money_Flow_Sum > 221250 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 1077.5 )
								if( Positive_Money_Flow_Sum <= 174968 )
									ret := 0.030303
								if( Positive_Money_Flow_Sum > 174968 )
									ret := -0.136126
						if( Raw_Money_Flow > 133877 )
							if( Negative_Money_Flow_Sum <= 79823.4 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 79823.4 )
								if( Raw_Money_Flow <= 1.21566e+06 )
									ret := -0.500000
								if( Raw_Money_Flow > 1.21566e+06 )
									ret := 0.000000
				if( Negative_Money_Flow > 58.889 )
					if( Negative_Money_Flow_Sum <= 198348 )
						if( Typical_Price <= 15.1652 )
							if( Negative_Money_Flow <= 4638.2 )
								if( Negative_Money_Flow_Sum <= 6684.03 )
									ret := -0.266667
								if( Negative_Money_Flow_Sum > 6684.03 )
									ret := 0.428944
							if( Negative_Money_Flow > 4638.2 )
								if( Positive_Money_Flow_Sum <= 711075 )
									ret := 0.166667
								if( Positive_Money_Flow_Sum > 711075 )
									ret := 0.550000
						if( Typical_Price > 15.1652 )
							if( bbm <= 0.001906 )
								if( Negative_Money_Flow_Sum <= 44903.2 )
									ret := 0.211111
								if( Negative_Money_Flow_Sum > 44903.2 )
									ret := -0.024272
							if( bbm > 0.001906 )
								if( Negative_Money_Flow <= 5645.5 )
									ret := 0.000000
								if( Negative_Money_Flow > 5645.5 )
									ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 198348 )
						if( Positive_Money_Flow_Sum <= 15953.5 )
							if( Money_Flow_Ratio <= 0.033411 )
								ret := 0.500000
							if( Money_Flow_Ratio > 0.033411 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 15953.5 )
							if( Positive_Money_Flow <= 78687.6 )
								if( Negative_Money_Flow <= 288.504 )
									ret := -0.714286 // sell
								if( Negative_Money_Flow > 288.504 )
									ret := 0.101190
							if( Positive_Money_Flow > 78687.6 )
								if( bearPower <= -0.003648 )
									ret := -1.000000 // sell
								if( bearPower > -0.003648 )
									ret := 0.000000
		if( bbm > 0.0049 )
			if( MFI_High <= -9.65746 )
				if( Negative_Money_Flow <= 13.7209 )
					if( bearPower <= -0.179937 )
						if( Positive_Money_Flow_Sum <= 311566 )
							ret := -0.500000
						if( Positive_Money_Flow_Sum > 311566 )
							if( MFI <= 25.0772 )
								if( bearPower <= -0.880169 )
									ret := 0.750000 // buy
								if( bearPower > -0.880169 )
									ret := 1.000000 // buy
							if( MFI > 25.0772 )
								if( bearPower <= -0.33642 )
									ret := 1.000000 // buy
								if( bearPower > -0.33642 )
									ret := 0.235294
					if( bearPower > -0.179937 )
						if( Positive_Money_Flow_Sum <= 980035 )
							if( Positive_Money_Flow_Sum <= 54998.6 )
								if( Typical_Price <= 15.7967 )
									ret := 0.301961
								if( Typical_Price > 15.7967 )
									ret := -0.333333
							if( Positive_Money_Flow_Sum > 54998.6 )
								if( Negative_Money_Flow_Sum <= 125916 )
									ret := -0.288889
								if( Negative_Money_Flow_Sum > 125916 )
									ret := -0.092927
						if( Positive_Money_Flow_Sum > 980035 )
							if( Money_Flow_Ratio <= 0.215148 )
								if( Typical_Price <= 15.0958 )
									ret := -0.360215
								if( Typical_Price > 15.0958 )
									ret := 0.058333
							if( Money_Flow_Ratio > 0.215148 )
								if( Positive_Money_Flow <= 2.84399e+06 )
									ret := 0.059019
								if( Positive_Money_Flow > 2.84399e+06 )
									ret := -0.125000
				if( Negative_Money_Flow > 13.7209 )
					if( Positive_Money_Flow_Sum <= 150052 )
						if( Raw_Money_Flow <= 3.11906e+06 )
							if( bbp <= -0.008227 )
								if( MFI_High <= -36.092 )
									ret := 0.349587
								if( MFI_High > -36.092 )
									ret := 0.534545
							if( bbp > -0.008227 )
								if( bearPower <= -0.042751 )
									ret := -0.909091 // sell
								if( bearPower > -0.042751 )
									ret := 0.142268
						if( Raw_Money_Flow > 3.11906e+06 )
							if( bbm <= 0.0695 )
								ret := 0.857143 // buy
							if( bbm > 0.0695 )
								if( bearPower <= -0.161969 )
									ret := -0.500000
								if( bearPower > -0.161969 )
									ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 150052 )
						if( Negative_Money_Flow_Sum <= 1.30425e+07 )
							if( Negative_Money_Flow_Sum <= 254544 )
								if( Typical_Price <= 16.3211 )
									ret := 0.406593
								if( Typical_Price > 16.3211 )
									ret := -0.360000
							if( Negative_Money_Flow_Sum > 254544 )
								if( bullPower <= -0.005907 )
									ret := 0.030456
								if( bullPower > -0.005907 )
									ret := 0.090307
						if( Negative_Money_Flow_Sum > 1.30425e+07 )
							if( MFI <= 7.05889 )
								if( bearPower <= -0.056368 )
									ret := 0.855670 // buy
								if( bearPower > -0.056368 )
									ret := 0.113208
							if( MFI > 7.05889 )
								if( Positive_Money_Flow_Sum <= 4.82496e+07 )
									ret := 0.201270
								if( Positive_Money_Flow_Sum > 4.82496e+07 )
									ret := -0.532258
			if( MFI_High > -9.65746 )
				if( Raw_Money_Flow <= 1.61193e+06 )
					if( bullPower <= 0.069689 )
						if( Money_Flow_Ratio <= 3.03054 )
							if( bbm <= 0.04005 )
								if( Raw_Money_Flow <= 130516 )
									ret := 0.055556
								if( Raw_Money_Flow > 130516 )
									ret := -0.163472
							if( bbm > 0.04005 )
								if( Positive_Money_Flow_Sum <= 1.64273e+07 )
									ret := -0.588652
								if( Positive_Money_Flow_Sum > 1.64273e+07 )
									ret := 0.285714
						if( Money_Flow_Ratio > 3.03054 )
							if( Raw_Money_Flow <= 1.13431e+06 )
								if( Positive_Money_Flow <= 664.999 )
									ret := 0.115909
								if( Positive_Money_Flow > 664.999 )
									ret := -0.045667
							if( Raw_Money_Flow > 1.13431e+06 )
								if( bbm <= 0.105 )
									ret := 0.634921
								if( bbm > 0.105 )
									ret := -0.600000
					if( bullPower > 0.069689 )
						if( Positive_Money_Flow_Sum <= 7.66762e+06 )
							if( MFI_Low <= 56.4463 )
								if( Typical_Price <= 14.1104 )
									ret := 0.166667
								if( Typical_Price > 14.1104 )
									ret := -0.833333 // sell
							if( MFI_Low > 56.4463 )
								if( bearPower <= -0.011387 )
									ret := -0.957447 // sell
								if( bearPower > -0.011387 )
									ret := -0.739130 // sell
						if( Positive_Money_Flow_Sum > 7.66762e+06 )
							if( MFI_Low <= 60.6342 )
								if( Typical_Price <= 11.4567 )
									ret := 0.500000
								if( Typical_Price > 11.4567 )
									ret := 1.000000 // buy
							if( MFI_Low > 60.6342 )
								if( Positive_Money_Flow_Sum <= 1.22797e+07 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 1.22797e+07 )
									ret := -1.000000 // sell
				if( Raw_Money_Flow > 1.61193e+06 )
					if( BBPower_Color <= 0.5 )
						if( Positive_Money_Flow_Sum <= 2.41595e+07 )
							if( Positive_Money_Flow_Sum <= 4.88134e+06 )
								if( Negative_Money_Flow_Sum <= 205114 )
									ret := -0.652174
								if( Negative_Money_Flow_Sum > 205114 )
									ret := 0.777778 // buy
							if( Positive_Money_Flow_Sum > 4.88134e+06 )
								if( Raw_Money_Flow <= 2.56401e+06 )
									ret := -0.600000
								if( Raw_Money_Flow > 2.56401e+06 )
									ret := -0.926471 // sell
						if( Positive_Money_Flow_Sum > 2.41595e+07 )
							if( Raw_Money_Flow <= 4.23128e+06 )
								if( MFI_High <= -2.98552 )
									ret := 0.750000 // buy
								if( MFI_High > -2.98552 )
									ret := 1.000000 // buy
							if( Raw_Money_Flow > 4.23128e+06 )
								ret := -0.571429
					if( BBPower_Color > 0.5 )
						if( bbp <= 0.192958 )
							if( Typical_Price <= 15.0125 )
								if( Positive_Money_Flow <= 2.01938e+06 )
									ret := -0.717391 // sell
								if( Positive_Money_Flow > 2.01938e+06 )
									ret := -0.276596
							if( Typical_Price > 15.0125 )
								if( Positive_Money_Flow_Sum <= 2.90765e+06 )
									ret := -0.875000 // sell
								if( Positive_Money_Flow_Sum > 2.90765e+06 )
									ret := 0.090909
						if( bbp > 0.192958 )
							ret := 1.000000 // buy
	if( bearPower > 0.002063 )
		if( Positive_Money_Flow_Sum <= 665468 )
			if( bbp <= 0.042569 )
				if( Negative_Money_Flow <= 116.419 )
					if( Typical_Price <= 11.6243 )
						if( bullPower <= 0.009705 )
							if( Raw_Money_Flow <= 2897.66 )
								if( bbm <= 2.9e-05 )
									ret := -0.101648
								if( bbm > 2.9e-05 )
									ret := -0.846154 // sell
							if( Raw_Money_Flow > 2897.66 )
								if( BBPower_Color <= 0.5 )
									ret := 0.586207
								if( BBPower_Color > 0.5 )
									ret := 0.028986
						if( bullPower > 0.009705 )
							if( Negative_Money_Flow_Sum <= 78253.6 )
								if( Positive_Money_Flow <= 43819.3 )
									ret := -0.185897
								if( Positive_Money_Flow > 43819.3 )
									ret := -0.606061
							if( Negative_Money_Flow_Sum > 78253.6 )
								if( Money_Flow_Ratio <= 0.237647 )
									ret := -0.259259
								if( Money_Flow_Ratio > 0.237647 )
									ret := 0.042254
					if( Typical_Price > 11.6243 )
						if( bearPower <= 0.005664 )
							if( Typical_Price <= 14.3532 )
								if( Typical_Price <= 13.65 )
									ret := -0.132075
								if( Typical_Price > 13.65 )
									ret := 0.396226
							if( Typical_Price > 14.3532 )
								if( bbm <= 0.010227 )
									ret := -0.140351
								if( bbm > 0.010227 )
									ret := -0.681818
						if( bearPower > 0.005664 )
							if( Positive_Money_Flow_Sum <= 26106.4 )
								if( Typical_Price <= 12.6979 )
									ret := -1.000000 // sell
								if( Typical_Price > 12.6979 )
									ret := -0.366337
							if( Positive_Money_Flow_Sum > 26106.4 )
								if( Negative_Money_Flow_Sum <= 228629 )
									ret := -0.275362
								if( Negative_Money_Flow_Sum > 228629 )
									ret := -0.062069
				if( Negative_Money_Flow > 116.419 )
					if( Positive_Money_Flow <= 2351.14 )
						if( Negative_Money_Flow_Sum <= 14711.1 )
							if( Negative_Money_Flow_Sum <= 11271.7 )
								if( BBPower_Color <= 0.5 )
									ret := 0.714286 // buy
								if( BBPower_Color > 0.5 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 11271.7 )
								if( Raw_Money_Flow <= 1412.46 )
									ret := 0.571429
								if( Raw_Money_Flow > 1412.46 )
									ret := 0.937500 // buy
						if( Negative_Money_Flow_Sum > 14711.1 )
							if( Positive_Money_Flow <= 161.737 )
								if( Negative_Money_Flow_Sum <= 56176.6 )
									ret := -0.135693
								if( Negative_Money_Flow_Sum > 56176.6 )
									ret := 0.154098
							if( Positive_Money_Flow > 161.737 )
								if( Typical_Price <= 11.1007 )
									ret := -0.522388
								if( Typical_Price > 11.1007 )
									ret := -0.080460
					if( Positive_Money_Flow > 2351.14 )
						if( Negative_Money_Flow <= 1514.52 )
							if( Positive_Money_Flow_Sum <= 399044 )
								if( bullPower <= 0.004365 )
									ret := 0.000000
								if( bullPower > 0.004365 )
									ret := 0.750000 // buy
							if( Positive_Money_Flow_Sum > 399044 )
								ret := -0.600000
						if( Negative_Money_Flow > 1514.52 )
							if( Negative_Money_Flow <= 1990.09 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 1990.09 )
								if( bullPower <= 0.017908 )
									ret := 0.375000
								if( bullPower > 0.017908 )
									ret := -0.304348
			if( bbp > 0.042569 )
				if( Raw_Money_Flow <= 20484.9 )
					if( MFI_High <= -79.7449 )
						if( Positive_Money_Flow <= 3975.04 )
							ret := -0.200000
						if( Positive_Money_Flow > 3975.04 )
							ret := 1.000000 // buy
					if( MFI_High > -79.7449 )
						if( Positive_Money_Flow <= 32.4043 )
							if( Raw_Money_Flow <= 6762.2 )
								if( Negative_Money_Flow_Sum <= 16363.3 )
									ret := -0.685714
								if( Negative_Money_Flow_Sum > 16363.3 )
									ret := -0.274112
							if( Raw_Money_Flow > 6762.2 )
								if( BBPower_Color <= 0.5 )
									ret := 1.000000 // buy
								if( BBPower_Color > 0.5 )
									ret := -0.070423
						if( Positive_Money_Flow > 32.4043 )
							if( bullPower <= 0.068996 )
								if( Money_Flow_Ratio <= 0.277773 )
									ret := -0.694215
								if( Money_Flow_Ratio > 0.277773 )
									ret := -0.394761
							if( bullPower > 0.068996 )
								if( Typical_Price <= 14.7968 )
									ret := -0.846939 // sell
								if( Typical_Price > 14.7968 )
									ret := -0.628571
				if( Raw_Money_Flow > 20484.9 )
					if( Positive_Money_Flow_Sum <= 421692 )
						if( Negative_Money_Flow_Sum <= 19253.2 )
							if( Positive_Money_Flow_Sum <= 104483 )
								if( Raw_Money_Flow <= 24534.7 )
									ret := -0.400000
								if( Raw_Money_Flow > 24534.7 )
									ret := -0.947368 // sell
							if( Positive_Money_Flow_Sum > 104483 )
								if( Positive_Money_Flow_Sum <= 143390 )
									ret := 0.250000
								if( Positive_Money_Flow_Sum > 143390 )
									ret := 0.000000
						if( Negative_Money_Flow_Sum > 19253.2 )
							if( Positive_Money_Flow_Sum <= 138310 )
								if( Positive_Money_Flow_Sum <= 130946 )
									ret := -0.127273
								if( Positive_Money_Flow_Sum > 130946 )
									ret := -0.875000 // sell
							if( Positive_Money_Flow_Sum > 138310 )
								if( bbm <= 0.026522 )
									ret := 0.239819
								if( bbm > 0.026522 )
									ret := -0.197080
					if( Positive_Money_Flow_Sum > 421692 )
						if( bbm <= 0.029381 )
							if( bearPower <= 0.028456 )
								if( Negative_Money_Flow_Sum <= 158823 )
									ret := -0.312500
								if( Negative_Money_Flow_Sum > 158823 )
									ret := 0.588235
							if( bearPower > 0.028456 )
								if( Negative_Money_Flow_Sum <= 247717 )
									ret := -0.363636
								if( Negative_Money_Flow_Sum > 247717 )
									ret := -1.000000 // sell
						if( bbm > 0.029381 )
							if( bearPower <= 0.056146 )
								if( Negative_Money_Flow_Sum <= 220686 )
									ret := -0.892857 // sell
								if( Negative_Money_Flow_Sum > 220686 )
									ret := -0.451613
							if( bearPower > 0.056146 )
								if( Typical_Price <= 14.8297 )
									ret := 0.750000 // buy
								if( Typical_Price > 14.8297 )
									ret := -0.400000
		if( Positive_Money_Flow_Sum > 665468 )
			if( bullPower <= 0.084055 )
				if( Positive_Money_Flow_Sum <= 1.22991e+07 )
					if( Positive_Money_Flow_Sum <= 1.08775e+07 )
						if( MFI_Low <= 45.0039 )
							if( Negative_Money_Flow_Sum <= 1.05597e+07 )
								if( Negative_Money_Flow_Sum <= 9.19765e+06 )
									ret := 0.067293
								if( Negative_Money_Flow_Sum > 9.19765e+06 )
									ret := 0.640625
							if( Negative_Money_Flow_Sum > 1.05597e+07 )
								if( bbm <= 0.036687 )
									ret := -0.355932
								if( bbm > 0.036687 )
									ret := 0.230769
						if( MFI_Low > 45.0039 )
							if( MFI_Low <= 77.922 )
								if( MFI_High <= -0.714367 )
									ret := -0.055301
								if( MFI_High > -0.714367 )
									ret := 0.048349
							if( MFI_Low > 77.922 )
								if( Typical_Price <= 15.5508 )
									ret := -0.188406
								if( Typical_Price > 15.5508 )
									ret := -0.866667 // sell
					if( Positive_Money_Flow_Sum > 1.08775e+07 )
						if( MFI_High <= -23.223 )
							if( Typical_Price <= 11.1193 )
								if( bbm <= 0.029305 )
									ret := -0.400000
								if( bbm > 0.029305 )
									ret := 0.500000
							if( Typical_Price > 11.1193 )
								if( Positive_Money_Flow_Sum <= 1.11567e+07 )
									ret := -0.250000
								if( Positive_Money_Flow_Sum > 1.11567e+07 )
									ret := -0.880000 // sell
						if( MFI_High > -23.223 )
							if( Raw_Money_Flow <= 318472 )
								if( Negative_Money_Flow_Sum <= 4.20216e+06 )
									ret := -0.518519
								if( Negative_Money_Flow_Sum > 4.20216e+06 )
									ret := 0.200000
							if( Raw_Money_Flow > 318472 )
								if( Positive_Money_Flow <= 3.11307e+06 )
									ret := 0.427518
								if( Positive_Money_Flow > 3.11307e+06 )
									ret := -0.500000
				if( Positive_Money_Flow_Sum > 1.22991e+07 )
					if( MFI_Low <= 63.5511 )
						if( MFI_Low <= 41.5867 )
							if( Positive_Money_Flow <= 1.24741e+06 )
								if( Positive_Money_Flow_Sum <= 2.44372e+07 )
									ret := -0.444444
								if( Positive_Money_Flow_Sum > 2.44372e+07 )
									ret := 0.152174
							if( Positive_Money_Flow > 1.24741e+06 )
								if( Money_Flow_Ratio <= 0.986767 )
									ret := -0.451613
								if( Money_Flow_Ratio > 0.986767 )
									ret := 0.595745
						if( MFI_Low > 41.5867 )
							if( bbm <= 0.058773 )
								if( Positive_Money_Flow <= 3.00424e+06 )
									ret := -0.302671
								if( Positive_Money_Flow > 3.00424e+06 )
									ret := -0.623932
							if( bbm > 0.058773 )
								if( MFI_High <= -10.5787 )
									ret := 0.833333 // buy
								if( MFI_High > -10.5787 )
									ret := 0.130435
					if( MFI_Low > 63.5511 )
						if( Negative_Money_Flow_Sum <= 975385 )
							if( Positive_Money_Flow <= 1.60842e+06 )
								if( Typical_Price <= 8.64303 )
									ret := -0.800000 // sell
								if( Typical_Price > 8.64303 )
									ret := -0.147541
							if( Positive_Money_Flow > 1.60842e+06 )
								if( bbp <= 0.030076 )
									ret := -0.500000
								if( bbp > 0.030076 )
									ret := -0.937500 // sell
						if( Negative_Money_Flow_Sum > 975385 )
							if( Typical_Price <= 10.4422 )
								if( Negative_Money_Flow_Sum <= 2.53285e+06 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 2.53285e+06 )
									ret := 0.632353
							if( Typical_Price > 10.4422 )
								if( bbm <= 0.002132 )
									ret := -0.305556
								if( bbm > 0.002132 )
									ret := 0.073733
			if( bullPower > 0.084055 )
				if( Negative_Money_Flow <= 119805 )
					if( MFI_High <= 5.95503 )
						if( bearPower <= 0.104085 )
							if( Positive_Money_Flow <= 4.37378e+06 )
								if( Typical_Price <= 10.4338 )
									ret := -0.690476
								if( Typical_Price > 10.4338 )
									ret := -0.125654
							if( Positive_Money_Flow > 4.37378e+06 )
								if( Typical_Price <= 12.2755 )
									ret := 0.714286 // buy
								if( Typical_Price > 12.2755 )
									ret := -0.707865 // sell
						if( bearPower > 0.104085 )
							if( Negative_Money_Flow_Sum <= 2.73076e+07 )
								if( Positive_Money_Flow_Sum <= 1.10246e+07 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 1.10246e+07 )
									ret := 0.815789 // buy
							if( Negative_Money_Flow_Sum > 2.73076e+07 )
								if( MFI_High <= -39.9316 )
									ret := 0.250000
								if( MFI_High > -39.9316 )
									ret := -1.000000 // sell
					if( MFI_High > 5.95503 )
						if( Typical_Price <= 9.58872 )
							if( Positive_Money_Flow_Sum <= 9.17555e+06 )
								if( bullPower <= 0.089549 )
									ret := -0.375000
								if( bullPower > 0.089549 )
									ret := 0.928571 // buy
							if( Positive_Money_Flow_Sum > 9.17555e+06 )
								if( MFI_High <= 16.1894 )
									ret := 0.166667
								if( MFI_High > 16.1894 )
									ret := -1.000000 // sell
						if( Typical_Price > 9.58872 )
							if( Raw_Money_Flow <= 302144 )
								if( MFI_High <= 18.9599 )
									ret := -1.000000 // sell
								if( MFI_High > 18.9599 )
									ret := -0.857143 // sell
							if( Raw_Money_Flow > 302144 )
								if( Positive_Money_Flow <= 358396 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow > 358396 )
									ret := -0.470588
				if( Negative_Money_Flow > 119805 )
					if( MFI <= 61.4173 )
						if( Positive_Money_Flow_Sum <= 8.23068e+06 )
							if( Raw_Money_Flow <= 465837 )
								if( Raw_Money_Flow <= 248917 )
									ret := -0.250000
								if( Raw_Money_Flow > 248917 )
									ret := -0.833333 // sell
							if( Raw_Money_Flow > 465837 )
								if( Positive_Money_Flow_Sum <= 7.10767e+06 )
									ret := -0.200000
								if( Positive_Money_Flow_Sum > 7.10767e+06 )
									ret := 0.750000 // buy
						if( Positive_Money_Flow_Sum > 8.23068e+06 )
							if( bbp <= 0.148673 )
								if( Typical_Price <= 14.5184 )
									ret := 0.333333
								if( Typical_Price > 14.5184 )
									ret := -0.750000 // sell
							if( bbp > 0.148673 )
								if( MFI_High <= -20.6161 )
									ret := -1.000000 // sell
								if( MFI_High > -20.6161 )
									ret := -0.625000
					if( MFI > 61.4173 )
						if( Positive_Money_Flow_Sum <= 1.74156e+07 )
							if( Positive_Money_Flow_Sum <= 1.1956e+07 )
								if( bbm <= 0.0524 )
									ret := 0.739130 // buy
								if( bbm > 0.0524 )
									ret := -0.138889
							if( Positive_Money_Flow_Sum > 1.1956e+07 )
								if( bbm <= 0.050737 )
									ret := -0.307692
								if( bbm > 0.050737 )
									ret := -0.857143 // sell
						if( Positive_Money_Flow_Sum > 1.74156e+07 )
							if( Raw_Money_Flow <= 4.65243e+06 )
								if( Negative_Money_Flow <= 854796 )
									ret := 0.000000
								if( Negative_Money_Flow > 854796 )
									ret := 0.702703 // buy
							if( Raw_Money_Flow > 4.65243e+06 )
								if( Positive_Money_Flow_Sum <= 6.5492e+07 )
									ret := 0.375000
								if( Positive_Money_Flow_Sum > 6.5492e+07 )
									ret := -0.733333 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_SNAP_1Min_9f0f0b9f(bbm, bearPower, bbp, bullPower, BBPower_Color, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


