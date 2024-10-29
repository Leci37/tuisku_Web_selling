//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: DOTUSDT_30Min_2MV0_cb5c79b6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_30Min_2MV0_cb5c79b6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_30Min_cb5c79b6(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Typical_Price <= 39.416 )
		if( Raw_Money_Flow <= 6.30386e+06 )
			if( Negative_Money_Flow <= 421651 )
				if( Positive_Money_Flow_Sum <= 7.9476e+07 )
					if( Positive_Money_Flow_Sum <= 2.47645e+07 )
						if( Negative_Money_Flow_Sum <= 3.66347e+07 )
							if( Raw_Money_Flow <= 4.42348e+06 )
								if( Positive_Money_Flow_Sum <= 1.24331e+06 )
									ret := -0.029123
								if( Positive_Money_Flow_Sum > 1.24331e+06 )
									ret := 0.024119
							if( Raw_Money_Flow > 4.42348e+06 )
								if( VIP_VIM <= 0.19549 )
									ret := 0.044177
								if( VIP_VIM > 0.19549 )
									ret := 0.597315
						if( Negative_Money_Flow_Sum > 3.66347e+07 )
							if( VIP <= 0.676335 )
								if( Typical_Price <= 15.8763 )
									ret := -0.300000
								if( Typical_Price > 15.8763 )
									ret := -0.928571 // sell
							if( VIP > 0.676335 )
								if( VIP <= 0.887528 )
									ret := 0.159919
								if( VIP > 0.887528 )
									ret := 0.451327
					if( Positive_Money_Flow_Sum > 2.47645e+07 )
						if( MFI <= 33.1412 )
							if( VIP <= 0.94807 )
								if( VIP_VIM <= -0.258263 )
									ret := -0.375839
								if( VIP_VIM > -0.258263 )
									ret := -0.730337 // sell
							if( VIP > 0.94807 )
								if( Negative_Money_Flow_Sum <= 8.31651e+07 )
									ret := 0.666667
								if( Negative_Money_Flow_Sum > 8.31651e+07 )
									ret := -1.000000 // sell
						if( MFI > 33.1412 )
							if( Money_Flow_Ratio <= 3.17282 )
								if( VIP_VIM <= 0.459133 )
									ret := -0.023741
								if( VIP_VIM > 0.459133 )
									ret := 0.363128
							if( Money_Flow_Ratio > 3.17282 )
								if( Positive_Money_Flow <= 5.63151e+06 )
									ret := -0.239165
								if( Positive_Money_Flow > 5.63151e+06 )
									ret := 0.590164
				if( Positive_Money_Flow_Sum > 7.9476e+07 )
					if( Positive_Money_Flow_Sum <= 1.01319e+08 )
						if( MFI_High <= -12.1927 )
							if( MFI <= 61.0585 )
								if( Positive_Money_Flow_Sum <= 9.40907e+07 )
									ret := 0.086957
								if( Positive_Money_Flow_Sum > 9.40907e+07 )
									ret := 1.000000 // buy
							if( MFI > 61.0585 )
								if( Positive_Money_Flow <= 5.83823e+06 )
									ret := 0.911765 // buy
								if( Positive_Money_Flow > 5.83823e+06 )
									ret := 0.000000
						if( MFI_High > -12.1927 )
							if( Positive_Money_Flow_Sum <= 9.36162e+07 )
								if( Negative_Money_Flow_Sum <= 3.45383e+07 )
									ret := 0.098361
								if( Negative_Money_Flow_Sum > 3.45383e+07 )
									ret := -0.761905 // sell
							if( Positive_Money_Flow_Sum > 9.36162e+07 )
								if( MFI_Low <= 52.0935 )
									ret := 0.000000
								if( MFI_Low > 52.0935 )
									ret := 0.825000 // buy
					if( Positive_Money_Flow_Sum > 1.01319e+08 )
						if( Typical_Price <= 36.66 )
							if( Raw_Money_Flow <= 5.04022e+06 )
								if( VIP_VIM <= 0.283468 )
									ret := -0.777778 // sell
								if( VIP_VIM > 0.283468 )
									ret := 0.521739
							if( Raw_Money_Flow > 5.04022e+06 )
								if( MFI <= 71.8347 )
									ret := -0.120000
								if( MFI > 71.8347 )
									ret := -0.705882 // sell
						if( Typical_Price > 36.66 )
							if( Typical_Price <= 37.6675 )
								if( VIM <= 0.79706 )
									ret := 0.750000 // buy
								if( VIM > 0.79706 )
									ret := 1.000000 // buy
							if( Typical_Price > 37.6675 )
								if( Negative_Money_Flow_Sum <= 4.57115e+07 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow_Sum > 4.57115e+07 )
									ret := -0.166667
			if( Negative_Money_Flow > 421651 )
				if( VIP <= 0.878901 )
					if( Positive_Money_Flow_Sum <= 5.06304e+07 )
						if( Negative_Money_Flow_Sum <= 4.19643e+06 )
							if( Money_Flow_Ratio <= 0.393077 )
								if( Positive_Money_Flow_Sum <= 942474 )
									ret := 0.017544
								if( Positive_Money_Flow_Sum > 942474 )
									ret := -0.357143
							if( Money_Flow_Ratio > 0.393077 )
								if( Positive_Money_Flow_Sum <= 905355 )
									ret := 0.625000
								if( Positive_Money_Flow_Sum > 905355 )
									ret := 0.016667
						if( Negative_Money_Flow_Sum > 4.19643e+06 )
							if( Typical_Price <= 6.71907 )
								if( Raw_Money_Flow <= 3.26926e+06 )
									ret := 0.226667
								if( Raw_Money_Flow > 3.26926e+06 )
									ret := 0.497143
							if( Typical_Price > 6.71907 )
								if( Positive_Money_Flow_Sum <= 4.18812e+07 )
									ret := 0.114603
								if( Positive_Money_Flow_Sum > 4.18812e+07 )
									ret := 0.652174
					if( Positive_Money_Flow_Sum > 5.06304e+07 )
						if( Negative_Money_Flow_Sum <= 8.49766e+07 )
							if( MFI_Low <= 23.9305 )
								if( VIM <= 1.13702 )
									ret := -0.600000
								if( VIM > 1.13702 )
									ret := 0.750000 // buy
							if( MFI_Low > 23.9305 )
								if( VIP_VIM <= -0.312536 )
									ret := -1.000000 // sell
								if( VIP_VIM > -0.312536 )
									ret := -0.250000
						if( Negative_Money_Flow_Sum > 8.49766e+07 )
							if( VIP_VIM <= -0.266816 )
								if( Negative_Money_Flow <= 5.89717e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 5.89717e+06 )
									ret := -0.750000 // sell
							if( VIP_VIM > -0.266816 )
								ret := -0.166667
				if( VIP > 0.878901 )
					if( VIP <= 1.26835 )
						if( Typical_Price <= 17.9925 )
							if( Negative_Money_Flow_Sum <= 2.53166e+07 )
								if( Positive_Money_Flow_Sum <= 2.43693e+07 )
									ret := 0.041743
								if( Positive_Money_Flow_Sum > 2.43693e+07 )
									ret := 0.198939
							if( Negative_Money_Flow_Sum > 2.53166e+07 )
								if( MFI <= 57.7278 )
									ret := 0.269072
								if( MFI > 57.7278 )
									ret := -0.157534
						if( Typical_Price > 17.9925 )
							if( Positive_Money_Flow_Sum <= 2.93701e+07 )
								if( Negative_Money_Flow_Sum <= 4.42741e+07 )
									ret := -0.094944
								if( Negative_Money_Flow_Sum > 4.42741e+07 )
									ret := 0.231707
							if( Positive_Money_Flow_Sum > 2.93701e+07 )
								if( VIP_VIM <= -0.214553 )
									ret := 0.382979
								if( VIP_VIM > -0.214553 )
									ret := 0.035836
					if( VIP > 1.26835 )
						if( Money_Flow_Ratio <= 12.0901 )
							if( Typical_Price <= 19.1307 )
								if( Negative_Money_Flow <= 5.53878e+06 )
									ret := 0.306867
								if( Negative_Money_Flow > 5.53878e+06 )
									ret := -0.263158
							if( Typical_Price > 19.1307 )
								if( Positive_Money_Flow_Sum <= 4.81405e+07 )
									ret := -0.409091
								if( Positive_Money_Flow_Sum > 4.81405e+07 )
									ret := 0.302326
						if( Money_Flow_Ratio > 12.0901 )
							if( Typical_Price <= 8.14666 )
								ret := -1.000000 // sell
							if( Typical_Price > 8.14666 )
								ret := -0.250000
		if( Raw_Money_Flow > 6.30386e+06 )
			if( Positive_Money_Flow <= 6.4154e+06 )
				if( Negative_Money_Flow_Sum <= 1.09262e+08 )
					if( Positive_Money_Flow_Sum <= 2.72828e+08 )
						if( Positive_Money_Flow_Sum <= 1.65785e+08 )
							if( Positive_Money_Flow_Sum <= 1.5233e+08 )
								if( Raw_Money_Flow <= 3.2516e+07 )
									ret := 0.202366
								if( Raw_Money_Flow > 3.2516e+07 )
									ret := 0.697674
							if( Positive_Money_Flow_Sum > 1.5233e+08 )
								if( VIP <= 1.18108 )
									ret := 0.227273
								if( VIP > 1.18108 )
									ret := -0.740000 // sell
						if( Positive_Money_Flow_Sum > 1.65785e+08 )
							if( Money_Flow_Ratio <= 1.69823 )
								ret := -1.000000 // sell
							if( Money_Flow_Ratio > 1.69823 )
								if( Positive_Money_Flow_Sum <= 1.89012e+08 )
									ret := 0.752809 // buy
								if( Positive_Money_Flow_Sum > 1.89012e+08 )
									ret := 0.200000
					if( Positive_Money_Flow_Sum > 2.72828e+08 )
						if( Raw_Money_Flow <= 1.82872e+07 )
							if( Positive_Money_Flow_Sum <= 3.02697e+08 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 3.02697e+08 )
								ret := -0.500000
						if( Raw_Money_Flow > 1.82872e+07 )
							ret := 0.000000
				if( Negative_Money_Flow_Sum > 1.09262e+08 )
					if( MFI_Low <= -15.7475 )
						if( Negative_Money_Flow_Sum <= 1.36598e+08 )
							ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 1.36598e+08 )
							if( MFI_Low <= -17.8379 )
								ret := 0.750000 // buy
							if( MFI_Low > -17.8379 )
								ret := -0.285714
					if( MFI_Low > -15.7475 )
						if( Typical_Price <= 30.2829 )
							if( Negative_Money_Flow <= 1.17527e+07 )
								if( Negative_Money_Flow_Sum <= 1.18115e+08 )
									ret := 0.685393
								if( Negative_Money_Flow_Sum > 1.18115e+08 )
									ret := 0.059880
							if( Negative_Money_Flow > 1.17527e+07 )
								if( Positive_Money_Flow_Sum <= 1.30333e+08 )
									ret := 0.606667
								if( Positive_Money_Flow_Sum > 1.30333e+08 )
									ret := 0.378261
						if( Typical_Price > 30.2829 )
							if( Negative_Money_Flow_Sum <= 2.58015e+08 )
								if( Negative_Money_Flow_Sum <= 2.06047e+08 )
									ret := 0.189610
								if( Negative_Money_Flow_Sum > 2.06047e+08 )
									ret := -0.344086
							if( Negative_Money_Flow_Sum > 2.58015e+08 )
								if( Negative_Money_Flow_Sum <= 3.4739e+08 )
									ret := 0.779221 // buy
								if( Negative_Money_Flow_Sum > 3.4739e+08 )
									ret := 0.120000
			if( Positive_Money_Flow > 6.4154e+06 )
				if( Positive_Money_Flow_Sum <= 2.60239e+08 )
					if( Positive_Money_Flow_Sum <= 5.96162e+07 )
						if( MFI_Low <= -0.304539 )
							if( Positive_Money_Flow_Sum <= 4.262e+07 )
								if( Positive_Money_Flow_Sum <= 1.63758e+07 )
									ret := 0.400000
								if( Positive_Money_Flow_Sum > 1.63758e+07 )
									ret := -0.777778 // sell
							if( Positive_Money_Flow_Sum > 4.262e+07 )
								if( Negative_Money_Flow_Sum <= 1.96882e+08 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 1.96882e+08 )
									ret := 0.500000
						if( MFI_Low > -0.304539 )
							if( Positive_Money_Flow <= 8.35601e+06 )
								if( MFI_High <= -24.5399 )
									ret := 0.125000
								if( MFI_High > -24.5399 )
									ret := -0.072941
							if( Positive_Money_Flow > 8.35601e+06 )
								if( Positive_Money_Flow <= 1.10393e+07 )
									ret := 0.311973
								if( Positive_Money_Flow > 1.10393e+07 )
									ret := 0.061135
					if( Positive_Money_Flow_Sum > 5.96162e+07 )
						if( Positive_Money_Flow_Sum <= 1.45114e+08 )
							if( Negative_Money_Flow_Sum <= 1.83462e+08 )
								if( Raw_Money_Flow <= 1.58969e+07 )
									ret := -0.070616
								if( Raw_Money_Flow > 1.58969e+07 )
									ret := 0.121777
							if( Negative_Money_Flow_Sum > 1.83462e+08 )
								if( VIM <= 1.14943 )
									ret := -0.701299 // sell
								if( VIM > 1.14943 )
									ret := 0.013158
						if( Positive_Money_Flow_Sum > 1.45114e+08 )
							if( Negative_Money_Flow_Sum <= 2.48644e+07 )
								if( Raw_Money_Flow <= 4.41454e+07 )
									ret := -0.875000 // sell
								if( Raw_Money_Flow > 4.41454e+07 )
									ret := -0.250000
							if( Negative_Money_Flow_Sum > 2.48644e+07 )
								if( Positive_Money_Flow_Sum <= 1.75702e+08 )
									ret := 0.384401
								if( Positive_Money_Flow_Sum > 1.75702e+08 )
									ret := 0.048387
				if( Positive_Money_Flow_Sum > 2.60239e+08 )
					if( VIP <= 0.820393 )
						ret := 1.000000 // buy
					if( VIP > 0.820393 )
						if( MFI_High <= 0.31359 )
							if( Typical_Price <= 18.5605 )
								ret := 0.333333
							if( Typical_Price > 18.5605 )
								if( Typical_Price <= 36.7131 )
									ret := -0.777778 // sell
								if( Typical_Price > 36.7131 )
									ret := 0.111111
						if( MFI_High > 0.31359 )
							if( VIP_VIM <= 0.848542 )
								if( Negative_Money_Flow_Sum <= 5.62929e+07 )
									ret := 0.687500
								if( Negative_Money_Flow_Sum > 5.62929e+07 )
									ret := -0.111111
							if( VIP_VIM > 0.848542 )
								ret := -1.000000 // sell
	if( Typical_Price > 39.416 )
		if( VIP_VIM <= -0.252705 )
			if( Positive_Money_Flow_Sum <= 4.89759e+07 )
				if( Negative_Money_Flow_Sum <= 9.78898e+07 )
					if( Money_Flow_Ratio <= 0.518145 )
						if( VIM <= 1.11527 )
							if( MFI_Low <= 5.9501 )
								ret := 1.000000 // buy
							if( MFI_Low > 5.9501 )
								ret := 0.000000
						if( VIM > 1.11527 )
							if( VIM <= 1.1337 )
								if( Raw_Money_Flow <= 9.83547e+06 )
									ret := 0.000000
								if( Raw_Money_Flow > 9.83547e+06 )
									ret := -0.750000 // sell
							if( VIM > 1.1337 )
								if( Negative_Money_Flow <= 7.28597e+06 )
									ret := 0.127119
								if( Negative_Money_Flow > 7.28597e+06 )
									ret := 0.419355
					if( Money_Flow_Ratio > 0.518145 )
						if( Positive_Money_Flow_Sum <= 3.78304e+07 )
							if( Positive_Money_Flow_Sum <= 3.59676e+07 )
								if( MFI_Low <= 16.2401 )
									ret := -0.625000
								if( MFI_Low > 16.2401 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 3.59676e+07 )
								if( VIP_VIM <= -0.271018 )
									ret := -1.000000 // sell
								if( VIP_VIM > -0.271018 )
									ret := -0.750000 // sell
						if( Positive_Money_Flow_Sum > 3.78304e+07 )
							ret := 0.000000
				if( Negative_Money_Flow_Sum > 9.78898e+07 )
					if( Negative_Money_Flow_Sum <= 3.03109e+08 )
						if( Raw_Money_Flow <= 1.39077e+07 )
							if( Negative_Money_Flow_Sum <= 1.26544e+08 )
								if( MFI <= 27.1117 )
									ret := -0.718750 // sell
								if( MFI > 27.1117 )
									ret := 0.312500
							if( Negative_Money_Flow_Sum > 1.26544e+08 )
								if( Negative_Money_Flow_Sum <= 1.38482e+08 )
									ret := 0.833333 // buy
								if( Negative_Money_Flow_Sum > 1.38482e+08 )
									ret := -0.187500
						if( Raw_Money_Flow > 1.39077e+07 )
							if( VIM <= 1.15635 )
								if( VIP_VIM <= -0.310469 )
									ret := 0.400000
								if( VIP_VIM > -0.310469 )
									ret := -0.833333 // sell
							if( VIM > 1.15635 )
								if( Negative_Money_Flow <= 2.76751e+07 )
									ret := -0.571429
								if( Negative_Money_Flow > 2.76751e+07 )
									ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 3.03109e+08 )
						if( Negative_Money_Flow_Sum <= 3.28958e+08 )
							ret := 0.750000 // buy
						if( Negative_Money_Flow_Sum > 3.28958e+08 )
							ret := 1.000000 // buy
			if( Positive_Money_Flow_Sum > 4.89759e+07 )
				if( MFI_Low <= 16.2984 )
					if( Raw_Money_Flow <= 8.8009e+06 )
						if( MFI <= 26.011 )
							if( Negative_Money_Flow <= 1.93673e+06 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 1.93673e+06 )
								ret := -0.500000
						if( MFI > 26.011 )
							if( Negative_Money_Flow <= 6.60848e+06 )
								if( Positive_Money_Flow <= 7.77149e+06 )
									ret := 0.727273 // buy
								if( Positive_Money_Flow > 7.77149e+06 )
									ret := 0.000000
							if( Negative_Money_Flow > 6.60848e+06 )
								ret := -0.600000
					if( Raw_Money_Flow > 8.8009e+06 )
						if( VIP_VIM <= -0.353364 )
							if( Negative_Money_Flow <= 4.43294e+07 )
								if( VIM <= 1.22748 )
									ret := 0.573770
								if( VIM > 1.22748 )
									ret := 0.000000
							if( Negative_Money_Flow > 4.43294e+07 )
								ret := -0.750000 // sell
						if( VIP_VIM > -0.353364 )
							if( Negative_Money_Flow <= 1.13228e+07 )
								if( Typical_Price <= 41.6726 )
									ret := 0.166667
								if( Typical_Price > 41.6726 )
									ret := 0.769231 // buy
							if( Negative_Money_Flow > 1.13228e+07 )
								if( MFI_Low <= 9.53286 )
									ret := 0.750000 // buy
								if( MFI_Low > 9.53286 )
									ret := 1.000000 // buy
				if( MFI_Low > 16.2984 )
					if( VIP <= 0.869429 )
						if( Raw_Money_Flow <= 3.32643e+07 )
							if( Raw_Money_Flow <= 2.48274e+07 )
								if( Positive_Money_Flow <= 1.80065e+07 )
									ret := -0.218750
								if( Positive_Money_Flow > 1.80065e+07 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 2.48274e+07 )
								ret := 0.800000 // buy
						if( Raw_Money_Flow > 3.32643e+07 )
							ret := -1.000000 // sell
					if( VIP > 0.869429 )
						if( Money_Flow_Ratio <= 0.635482 )
							ret := -0.250000
						if( Money_Flow_Ratio > 0.635482 )
							if( Typical_Price <= 45.4362 )
								ret := 1.000000 // buy
							if( Typical_Price > 45.4362 )
								ret := 0.750000 // buy
		if( VIP_VIM > -0.252705 )
			if( Negative_Money_Flow_Sum <= 6.98934e+07 )
				if( Typical_Price <= 43.8228 )
					if( Positive_Money_Flow <= 8.72771e+06 )
						if( MFI_High <= -38.6124 )
							if( Positive_Money_Flow_Sum <= 2.62689e+07 )
								if( VIM <= 1.11005 )
									ret := 0.531250
								if( VIM > 1.11005 )
									ret := 0.071429
							if( Positive_Money_Flow_Sum > 2.62689e+07 )
								if( MFI_Low <= 18.7023 )
									ret := -0.513514
								if( MFI_Low > 18.7023 )
									ret := 0.461538
						if( MFI_High > -38.6124 )
							if( VIM <= 1.10405 )
								if( Positive_Money_Flow <= 5.89508e+06 )
									ret := 0.021148
								if( Positive_Money_Flow > 5.89508e+06 )
									ret := -0.261538
							if( VIM > 1.10405 )
								if( Positive_Money_Flow_Sum <= 5.04247e+07 )
									ret := -0.777778 // sell
								if( Positive_Money_Flow_Sum > 5.04247e+07 )
									ret := -0.166667
					if( Positive_Money_Flow > 8.72771e+06 )
						if( MFI_Low <= 35.6409 )
							if( VIP <= 0.97971 )
								if( Positive_Money_Flow <= 1.02539e+07 )
									ret := 0.611111
								if( Positive_Money_Flow > 1.02539e+07 )
									ret := -0.500000
							if( VIP > 0.97971 )
								if( VIM <= 0.925232 )
									ret := 0.200000
								if( VIM > 0.925232 )
									ret := 1.000000 // buy
						if( MFI_Low > 35.6409 )
							if( Negative_Money_Flow_Sum <= 4.26175e+07 )
								if( Negative_Money_Flow_Sum <= 2.55159e+07 )
									ret := -0.243243
								if( Negative_Money_Flow_Sum > 2.55159e+07 )
									ret := 0.454545
							if( Negative_Money_Flow_Sum > 4.26175e+07 )
								if( VIP_VIM <= 0.388453 )
									ret := -0.257143
								if( VIP_VIM > 0.388453 )
									ret := 0.315789
				if( Typical_Price > 43.8228 )
					if( VIM <= 0.752768 )
						if( Positive_Money_Flow_Sum <= 1.91168e+08 )
							if( Positive_Money_Flow <= 1.01571e+07 )
								if( MFI_Low <= 64.0497 )
									ret := 0.071429
								if( MFI_Low > 64.0497 )
									ret := -0.750000 // sell
							if( Positive_Money_Flow > 1.01571e+07 )
								if( Typical_Price <= 45.1017 )
									ret := 0.818182 // buy
								if( Typical_Price > 45.1017 )
									ret := 0.285714
						if( Positive_Money_Flow_Sum > 1.91168e+08 )
							if( VIP_VIM <= 0.715706 )
								ret := -0.833333 // sell
							if( VIP_VIM > 0.715706 )
								if( Typical_Price <= 44.5033 )
									ret := 0.250000
								if( Typical_Price > 44.5033 )
									ret := -0.142857
					if( VIM > 0.752768 )
						if( Money_Flow_Ratio <= 1.58672 )
							if( VIM <= 1.05326 )
								if( MFI_High <= -25.5664 )
									ret := 0.115702
								if( MFI_High > -25.5664 )
									ret := -0.255814
							if( VIM > 1.05326 )
								if( MFI_High <= -42.1617 )
									ret := 0.058824
								if( MFI_High > -42.1617 )
									ret := -0.506849
						if( Money_Flow_Ratio > 1.58672 )
							if( Negative_Money_Flow_Sum <= 4.3104e+07 )
								if( Positive_Money_Flow_Sum <= 9.55062e+07 )
									ret := -0.275000
								if( Positive_Money_Flow_Sum > 9.55062e+07 )
									ret := -0.681818
							if( Negative_Money_Flow_Sum > 4.3104e+07 )
								if( VIP <= 1.20703 )
									ret := -0.875000 // sell
								if( VIP > 1.20703 )
									ret := 0.000000
			if( Negative_Money_Flow_Sum > 6.98934e+07 )
				if( Typical_Price <= 45.7377 )
					if( Negative_Money_Flow <= 1.15603e+07 )
						if( Negative_Money_Flow_Sum <= 1.24156e+08 )
							if( MFI_Low <= 16.3529 )
								if( VIP_VIM <= -0.24602 )
									ret := -1.000000 // sell
								if( VIP_VIM > -0.24602 )
									ret := 0.220339
							if( MFI_Low > 16.3529 )
								if( VIM <= 0.918962 )
									ret := -0.077778
								if( VIM > 0.918962 )
									ret := -0.507937
						if( Negative_Money_Flow_Sum > 1.24156e+08 )
							if( Negative_Money_Flow_Sum <= 2.58349e+08 )
								if( VIP <= 0.947364 )
									ret := -0.493151
								if( VIP > 0.947364 )
									ret := -0.800000 // sell
							if( Negative_Money_Flow_Sum > 2.58349e+08 )
								if( Positive_Money_Flow <= 1.39697e+07 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow > 1.39697e+07 )
									ret := 0.250000
					if( Negative_Money_Flow > 1.15603e+07 )
						if( Positive_Money_Flow_Sum <= 5.4692e+07 )
							if( Raw_Money_Flow <= 1.51179e+07 )
								ret := -0.142857
							if( Raw_Money_Flow > 1.51179e+07 )
								if( VIP <= 0.972742 )
									ret := -1.000000 // sell
								if( VIP > 0.972742 )
									ret := -0.750000 // sell
						if( Positive_Money_Flow_Sum > 5.4692e+07 )
							if( VIP <= 1.0224 )
								if( Negative_Money_Flow_Sum <= 1.18442e+08 )
									ret := 0.566667
								if( Negative_Money_Flow_Sum > 1.18442e+08 )
									ret := 0.044776
							if( VIP > 1.0224 )
								if( VIP_VIM <= 0.719733 )
									ret := -0.415842
								if( VIP_VIM > 0.719733 )
									ret := 1.000000 // buy
				if( Typical_Price > 45.7377 )
					if( Positive_Money_Flow_Sum <= 3.82577e+08 )
						if( MFI_High <= -12.5762 )
							if( VIP_VIM <= 0.2165 )
								if( Positive_Money_Flow_Sum <= 2.30882e+08 )
									ret := 0.070513
								if( Positive_Money_Flow_Sum > 2.30882e+08 )
									ret := -0.653846
							if( VIP_VIM > 0.2165 )
								if( Negative_Money_Flow <= 3.86476e+06 )
									ret := 0.125000
								if( Negative_Money_Flow > 3.86476e+06 )
									ret := 0.785714 // buy
						if( MFI_High > -12.5762 )
							if( Positive_Money_Flow_Sum <= 3.62781e+08 )
								if( Positive_Money_Flow_Sum <= 2.38966e+08 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 2.38966e+08 )
									ret := -0.666667
							if( Positive_Money_Flow_Sum > 3.62781e+08 )
								ret := 0.200000
					if( Positive_Money_Flow_Sum > 3.82577e+08 )
						if( VIM <= 0.758143 )
							ret := 1.000000 // buy
						if( VIM > 0.758143 )
							ret := -0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_DOTUSDT_30Min_cb5c79b6(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)

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


