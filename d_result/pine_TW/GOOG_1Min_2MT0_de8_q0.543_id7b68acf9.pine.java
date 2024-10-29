//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: GOOG_1Min_2MT0_7b68acf9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GOOG_1Min_2MT0_7b68acf9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GOOG_1Min_7b68acf9(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Negative_Money_Flow_Sum <= 2.43957e+07 )
		if( ema12 <= -0.073265 )
			if( Raw_Money_Flow <= 786522 )
				if( Negative_Money_Flow_Sum <= 1.62965e+06 )
					if( MFI_High <= -68.7311 )
						if( Money_Flow_Ratio <= 0.071723 )
							if( Negative_Money_Flow_Sum <= 1.27629e+06 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.27629e+06 )
								ret := -0.461538
						if( Money_Flow_Ratio > 0.071723 )
							if( MFI_High <= -69.994 )
								if( Typical_Price <= 174.647 )
									ret := 0.434783
								if( Typical_Price > 174.647 )
									ret := -0.238095
							if( MFI_High > -69.994 )
								if( MFI <= 10.4034 )
									ret := -0.777778 // sell
								if( MFI > 10.4034 )
									ret := -0.250000
					if( MFI_High > -68.7311 )
						if( Negative_Money_Flow <= 45685.9 )
							if( Negative_Money_Flow_Sum <= 345909 )
								ret := -0.928571 // sell
							if( Negative_Money_Flow_Sum > 345909 )
								if( Positive_Money_Flow <= 333752 )
									ret := 0.423800
								if( Positive_Money_Flow > 333752 )
									ret := -0.116883
						if( Negative_Money_Flow > 45685.9 )
							if( Raw_Money_Flow <= 50998.1 )
								if( Positive_Money_Flow_Sum <= 798070 )
									ret := -0.172414
								if( Positive_Money_Flow_Sum > 798070 )
									ret := -0.750000 // sell
							if( Raw_Money_Flow > 50998.1 )
								if( ema13 <= -0.548021 )
									ret := -0.354839
								if( ema13 > -0.548021 )
									ret := 0.247884
				if( Negative_Money_Flow_Sum > 1.62965e+06 )
					if( MFI_Low <= 47.8003 )
						if( tema <= 154.039 )
							if( Positive_Money_Flow <= 25993.8 )
								if( MFI <= 26.8382 )
									ret := 1.000000 // buy
								if( MFI > 26.8382 )
									ret := 0.642857
							if( Positive_Money_Flow > 25993.8 )
								ret := 0.428571
						if( tema > 154.039 )
							if( ema3 <= 155.221 )
								if( Typical_Price <= 154.403 )
									ret := -0.636364
								if( Typical_Price > 154.403 )
									ret := -1.000000 // sell
							if( ema3 > 155.221 )
								if( Raw_Money_Flow <= 213074 )
									ret := -0.058001
								if( Raw_Money_Flow > 213074 )
									ret := 0.149312
					if( MFI_Low > 47.8003 )
						if( ema2 <= 165.572 )
							ret := -0.181818
						if( ema2 > 165.572 )
							if( MFI <= 91.2801 )
								if( Raw_Money_Flow <= 79110.3 )
									ret := 0.533333
								if( Raw_Money_Flow > 79110.3 )
									ret := 0.921569 // buy
							if( MFI > 91.2801 )
								if( tema <= 167.769 )
									ret := 1.000000 // buy
								if( tema > 167.769 )
									ret := -0.055556
			if( Raw_Money_Flow > 786522 )
				if( ema12 <= -0.111893 )
					if( ema3 <= 179.547 )
						if( ema12 <= -0.532418 )
							if( ema1 <= 164.218 )
								ret := 0.000000
							if( ema1 > 164.218 )
								ret := -0.384615
						if( ema12 > -0.532418 )
							if( Negative_Money_Flow_Sum <= 2.34551e+07 )
								if( Raw_Money_Flow <= 2.33089e+06 )
									ret := 0.414122
								if( Raw_Money_Flow > 2.33089e+06 )
									ret := 0.720930 // buy
							if( Negative_Money_Flow_Sum > 2.34551e+07 )
								if( Positive_Money_Flow <= 344270 )
									ret := 0.384615
								if( Positive_Money_Flow > 344270 )
									ret := -0.700000 // sell
					if( ema3 > 179.547 )
						if( ema12 <= -0.134892 )
							if( MFI_Low <= 25.7591 )
								if( ema3 <= 181.064 )
									ret := 0.826087 // buy
								if( ema3 > 181.064 )
									ret := 0.950820 // buy
							if( MFI_Low > 25.7591 )
								ret := 0.733333 // buy
						if( ema12 > -0.134892 )
							if( Typical_Price <= 183.526 )
								ret := 0.363636
							if( Typical_Price > 183.526 )
								ret := 0.722222 // buy
				if( ema12 > -0.111893 )
					if( Negative_Money_Flow_Sum <= 1.93381e+06 )
						if( MFI_High <= -24.8671 )
							ret := 0.636364
						if( MFI_High > -24.8671 )
							ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 1.93381e+06 )
						if( Negative_Money_Flow_Sum <= 3.38912e+06 )
							if( Typical_Price <= 171.856 )
								if( Negative_Money_Flow <= 1.25376e+06 )
									ret := -0.771429 // sell
								if( Negative_Money_Flow > 1.25376e+06 )
									ret := 0.000000
							if( Typical_Price > 171.856 )
								ret := 0.142857
						if( Negative_Money_Flow_Sum > 3.38912e+06 )
							if( ema13 <= -0.21741 )
								if( ema13 <= -0.257751 )
									ret := -1.000000 // sell
								if( ema13 > -0.257751 )
									ret := -0.500000
							if( ema13 > -0.21741 )
								if( Negative_Money_Flow_Sum <= 4.83807e+06 )
									ret := 0.770833 // buy
								if( Negative_Money_Flow_Sum > 4.83807e+06 )
									ret := 0.134380
		if( ema12 > -0.073265 )
			if( Money_Flow_Ratio <= 10.9239 )
				if( Negative_Money_Flow <= 1215.69 )
					if( Negative_Money_Flow_Sum <= 6.38306e+06 )
						if( ema1 <= 168.77 )
							if( Raw_Money_Flow <= 339314 )
								if( tema <= 168.694 )
									ret := -0.014937
								if( tema > 168.694 )
									ret := 0.490196
							if( Raw_Money_Flow > 339314 )
								if( ema3 <= 158.231 )
									ret := 0.122807
								if( ema3 > 158.231 )
									ret := -0.190128
						if( ema1 > 168.77 )
							if( Positive_Money_Flow_Sum <= 3.25641e+06 )
								if( Positive_Money_Flow <= 1.3509e+06 )
									ret := -0.093116
								if( Positive_Money_Flow > 1.3509e+06 )
									ret := 0.636364
							if( Positive_Money_Flow_Sum > 3.25641e+06 )
								if( ema13 <= 0.233197 )
									ret := -0.258114
								if( ema13 > 0.233197 )
									ret := -0.616438
					if( Negative_Money_Flow_Sum > 6.38306e+06 )
						if( MFI <= 34.8929 )
							if( ema12 <= -0.07085 )
								ret := -0.736842 // sell
							if( ema12 > -0.07085 )
								if( ema1 <= 162.245 )
									ret := 0.077922
								if( ema1 > 162.245 )
									ret := -0.215881
						if( MFI > 34.8929 )
							if( MFI_High <= 10.1692 )
								if( Positive_Money_Flow_Sum <= 1.20352e+08 )
									ret := 0.033937
								if( Positive_Money_Flow_Sum > 1.20352e+08 )
									ret := -0.540541
							if( MFI_High > 10.1692 )
								if( tema <= 167.322 )
									ret := 0.746032 // buy
								if( tema > 167.322 )
									ret := 0.131868
				if( Negative_Money_Flow > 1215.69 )
					if( Negative_Money_Flow_Sum <= 357777 )
						if( ema12 <= 0.044889 )
							if( Positive_Money_Flow_Sum <= 337643 )
								if( ema3 <= 170.096 )
									ret := -0.185185
								if( ema3 > 170.096 )
									ret := 0.870968 // buy
							if( Positive_Money_Flow_Sum > 337643 )
								if( Positive_Money_Flow_Sum <= 757516 )
									ret := -0.329268
								if( Positive_Money_Flow_Sum > 757516 )
									ret := 0.198113
						if( ema12 > 0.044889 )
							if( Positive_Money_Flow <= 71.0935 )
								if( Money_Flow_Ratio <= 3.47399 )
									ret := 0.039370
								if( Money_Flow_Ratio > 3.47399 )
									ret := -0.378882
							if( Positive_Money_Flow > 71.0935 )
								if( ema12 <= 0.088835 )
									ret := -0.555556
								if( ema12 > 0.088835 )
									ret := -0.911111 // sell
					if( Negative_Money_Flow_Sum > 357777 )
						if( ema12 <= 0.027256 )
							if( Negative_Money_Flow <= 37990.8 )
								if( MFI_Low <= 36.8327 )
									ret := 0.205703
								if( MFI_Low > 36.8327 )
									ret := 0.445545
							if( Negative_Money_Flow > 37990.8 )
								if( MFI <= 17.7878 )
									ret := -0.125000
								if( MFI > 17.7878 )
									ret := 0.074723
						if( ema12 > 0.027256 )
							if( Positive_Money_Flow_Sum <= 2.87085e+06 )
								if( ema2 <= 158.984 )
									ret := 0.141210
								if( ema2 > 158.984 )
									ret := -0.130712
							if( Positive_Money_Flow_Sum > 2.87085e+06 )
								if( Money_Flow_Ratio <= 0.824779 )
									ret := 0.451852
								if( Money_Flow_Ratio > 0.824779 )
									ret := 0.040893
			if( Money_Flow_Ratio > 10.9239 )
				if( Raw_Money_Flow <= 168691 )
					if( ema2 <= 159.879 )
						if( Money_Flow_Ratio <= 31.1263 )
							if( MFI_Low <= 72.502 )
								ret := 0.230769
							if( MFI_Low > 72.502 )
								if( Typical_Price <= 157.745 )
									ret := 0.461538
								if( Typical_Price > 157.745 )
									ret := 0.914894 // buy
						if( Money_Flow_Ratio > 31.1263 )
							ret := 0.000000
					if( ema2 > 159.879 )
						if( MFI_High <= 19.5885 )
							if( ema13 <= -0.005678 )
								if( Money_Flow_Ratio <= 18.5389 )
									ret := 0.526316
								if( Money_Flow_Ratio > 18.5389 )
									ret := 0.040000
							if( ema13 > -0.005678 )
								if( Positive_Money_Flow <= 27139.8 )
									ret := -0.094017
								if( Positive_Money_Flow > 27139.8 )
									ret := -0.570000
						if( MFI_High > 19.5885 )
							if( Positive_Money_Flow_Sum <= 1.63181e+08 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 1.63181e+08 )
								ret := 0.000000
				if( Raw_Money_Flow > 168691 )
					if( Money_Flow_Ratio <= 25.3923 )
						if( Negative_Money_Flow_Sum <= 1.78693e+07 )
							if( Raw_Money_Flow <= 7.10793e+06 )
								if( Positive_Money_Flow <= 1.32467e+06 )
									ret := -0.540404
								if( Positive_Money_Flow > 1.32467e+06 )
									ret := 0.133721
							if( Raw_Money_Flow > 7.10793e+06 )
								if( ema13 <= -0.124861 )
									ret := 0.555556
								if( ema13 > -0.124861 )
									ret := -0.715543 // sell
						if( Negative_Money_Flow_Sum > 1.78693e+07 )
							if( ema1 <= 173.944 )
								ret := 0.000000
							if( ema1 > 173.944 )
								if( ema1 <= 174.985 )
									ret := 0.777778 // buy
								if( ema1 > 174.985 )
									ret := 0.181818
					if( Money_Flow_Ratio > 25.3923 )
						if( ema1 <= 181.717 )
							if( tema <= 180.763 )
								if( Positive_Money_Flow_Sum <= 2.38404e+08 )
									ret := -0.108571
								if( Positive_Money_Flow_Sum > 2.38404e+08 )
									ret := -0.612903
							if( tema > 180.763 )
								ret := -0.777778 // sell
						if( ema1 > 181.717 )
							if( Positive_Money_Flow <= 6.29196e+06 )
								ret := 0.000000
							if( Positive_Money_Flow > 6.29196e+06 )
								if( Raw_Money_Flow <= 3.29398e+07 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 3.29398e+07 )
									ret := 0.818182 // buy
	if( Negative_Money_Flow_Sum > 2.43957e+07 )
		if( Positive_Money_Flow_Sum <= 2.42384e+07 )
			if( Positive_Money_Flow <= 4.22798e+06 )
				if( ema12 <= -0.512705 )
					if( ema2 <= 163.805 )
						ret := 0.375000
					if( ema2 > 163.805 )
						if( ema2 <= 176.415 )
							if( Negative_Money_Flow <= 3.92067e+06 )
								ret := -0.625000
							if( Negative_Money_Flow > 3.92067e+06 )
								if( Money_Flow_Ratio <= 0.070603 )
									ret := -0.888889 // sell
								if( Money_Flow_Ratio > 0.070603 )
									ret := -1.000000 // sell
						if( ema2 > 176.415 )
							if( ema1 <= 180.648 )
								if( MFI_Low <= -1.32417 )
									ret := -0.250000
								if( MFI_Low > -1.32417 )
									ret := 0.777778 // buy
							if( ema1 > 180.648 )
								if( Negative_Money_Flow <= 5.17458e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 5.17458e+06 )
									ret := -0.181818
				if( ema12 > -0.512705 )
					if( MFI <= 33.31 )
						if( ema1 <= 180.755 )
							if( ema12 <= -0.259985 )
								if( Raw_Money_Flow <= 2.74732e+07 )
									ret := 0.450617
								if( Raw_Money_Flow > 2.74732e+07 )
									ret := -0.736842 // sell
							if( ema12 > -0.259985 )
								if( MFI_High <= -48.0028 )
									ret := 0.028138
								if( MFI_High > -48.0028 )
									ret := -0.185501
						if( ema1 > 180.755 )
							if( MFI <= 15.7003 )
								if( ema2 <= 186.54 )
									ret := -0.634921
								if( ema2 > 186.54 )
									ret := -0.152174
							if( MFI > 15.7003 )
								if( ema12 <= -0.010318 )
									ret := 0.032389
								if( ema12 > -0.010318 )
									ret := -0.500000
					if( MFI > 33.31 )
						if( Raw_Money_Flow <= 1.37926e+06 )
							if( MFI_Low <= 15.6621 )
								if( tema <= 170.094 )
									ret := -0.818182 // sell
								if( tema > 170.094 )
									ret := -0.933333 // sell
							if( MFI_Low > 15.6621 )
								if( ema12 <= 0.009171 )
									ret := -0.333333
								if( ema12 > 0.009171 )
									ret := 0.000000
						if( Raw_Money_Flow > 1.37926e+06 )
							if( Negative_Money_Flow_Sum <= 2.9145e+07 )
								if( MFI_Low <= 13.8361 )
									ret := 0.609375
								if( MFI_Low > 13.8361 )
									ret := -0.000573
							if( Negative_Money_Flow_Sum > 2.9145e+07 )
								if( Typical_Price <= 179.406 )
									ret := 0.146108
								if( Typical_Price > 179.406 )
									ret := 0.492908
			if( Positive_Money_Flow > 4.22798e+06 )
				if( Money_Flow_Ratio <= 0.174536 )
					if( ema12 <= -0.20633 )
						if( Positive_Money_Flow_Sum <= 1.56502e+07 )
							if( Money_Flow_Ratio <= 0.125674 )
								ret := -0.545455
							if( Money_Flow_Ratio > 0.125674 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 1.56502e+07 )
							if( Positive_Money_Flow <= 1.15939e+07 )
								ret := 0.500000
							if( Positive_Money_Flow > 1.15939e+07 )
								ret := -0.230769
					if( ema12 > -0.20633 )
						if( MFI_High <= -72.0575 )
							ret := -0.083333
						if( MFI_High > -72.0575 )
							if( Positive_Money_Flow <= 5.10187e+06 )
								ret := 0.529412
							if( Positive_Money_Flow > 5.10187e+06 )
								if( ema13 <= -0.249282 )
									ret := 1.000000 // buy
								if( ema13 > -0.249282 )
									ret := 0.666667
				if( Money_Flow_Ratio > 0.174536 )
					if( MFI_Low <= -3.6738 )
						if( ema1 <= 168.902 )
							ret := -1.000000 // sell
						if( ema1 > 168.902 )
							ret := -0.714286 // sell
					if( MFI_Low > -3.6738 )
						if( MFI_Low <= 5.94617 )
							if( ema2 <= 151.883 )
								ret := 0.666667
							if( ema2 > 151.883 )
								if( MFI_High <= -55.5961 )
									ret := -0.194553
								if( MFI_High > -55.5961 )
									ret := -0.504065
						if( MFI_Low > 5.94617 )
							if( Money_Flow_Ratio <= 0.561757 )
								if( MFI <= 26.4628 )
									ret := 0.617647
								if( MFI > 26.4628 )
									ret := 0.053512
							if( Money_Flow_Ratio > 0.561757 )
								if( Positive_Money_Flow_Sum <= 2.25967e+07 )
									ret := -0.469194
								if( Positive_Money_Flow_Sum > 2.25967e+07 )
									ret := 0.173077
		if( Positive_Money_Flow_Sum > 2.42384e+07 )
			if( Money_Flow_Ratio <= 0.91439 )
				if( ema12 <= -0.185286 )
					if( Raw_Money_Flow <= 3.92168e+07 )
						if( ema2 <= 173.5 )
							if( ema12 <= -0.697303 )
								ret := 0.812500 // buy
							if( ema12 > -0.697303 )
								if( tema <= 159.192 )
									ret := -0.653061
								if( tema > 159.192 )
									ret := -0.359375
						if( ema2 > 173.5 )
							if( Negative_Money_Flow_Sum <= 1.11376e+08 )
								if( Positive_Money_Flow <= 6.57153e+06 )
									ret := -0.448052
								if( Positive_Money_Flow > 6.57153e+06 )
									ret := 0.500000
							if( Negative_Money_Flow_Sum > 1.11376e+08 )
								if( ema13 <= -0.459628 )
									ret := 0.490909
								if( ema13 > -0.459628 )
									ret := -0.100840
					if( Raw_Money_Flow > 3.92168e+07 )
						if( Typical_Price <= 174.445 )
							if( Positive_Money_Flow_Sum <= 5.31583e+07 )
								if( Negative_Money_Flow_Sum <= 4.56451e+08 )
									ret := -0.114286
								if( Negative_Money_Flow_Sum > 4.56451e+08 )
									ret := 0.875000 // buy
							if( Positive_Money_Flow_Sum > 5.31583e+07 )
								if( MFI_High <= -51.7124 )
									ret := 0.877551 // buy
								if( MFI_High > -51.7124 )
									ret := 0.269231
						if( Typical_Price > 174.445 )
							ret := -0.176471
				if( ema12 > -0.185286 )
					if( ema12 <= 0.002163 )
						if( Negative_Money_Flow_Sum <= 4.56029e+07 )
							if( Money_Flow_Ratio <= 0.592986 )
								if( Negative_Money_Flow_Sum <= 4.4548e+07 )
									ret := 0.653846
								if( Negative_Money_Flow_Sum > 4.4548e+07 )
									ret := -0.178571
							if( Money_Flow_Ratio > 0.592986 )
								if( Typical_Price <= 172.994 )
									ret := -0.259368
								if( Typical_Price > 172.994 )
									ret := -0.107987
						if( Negative_Money_Flow_Sum > 4.56029e+07 )
							if( Positive_Money_Flow_Sum <= 8.46934e+07 )
								if( ema3 <= 181.261 )
									ret := 0.042210
								if( ema3 > 181.261 )
									ret := -0.198425
							if( Positive_Money_Flow_Sum > 8.46934e+07 )
								if( Negative_Money_Flow <= 464756 )
									ret := 0.054945
								if( Negative_Money_Flow > 464756 )
									ret := 0.490991
					if( ema12 > 0.002163 )
						if( ema2 <= 172.682 )
							if( MFI_High <= -32.3747 )
								if( Negative_Money_Flow <= 8.67301e+06 )
									ret := -0.267306
								if( Negative_Money_Flow > 8.67301e+06 )
									ret := 0.179389
							if( MFI_High > -32.3747 )
								if( Negative_Money_Flow_Sum <= 5.92772e+07 )
									ret := -0.828571 // sell
								if( Negative_Money_Flow_Sum > 5.92772e+07 )
									ret := -0.384615
						if( ema2 > 172.682 )
							if( MFI_Low <= 20.4657 )
								if( Money_Flow_Ratio <= 0.418507 )
									ret := 0.017857
								if( Money_Flow_Ratio > 0.418507 )
									ret := -0.364985
							if( MFI_Low > 20.4657 )
								if( ema13 <= 0.551828 )
									ret := 0.075617
								if( ema13 > 0.551828 )
									ret := -0.842105 // sell
			if( Money_Flow_Ratio > 0.91439 )
				if( MFI_Low <= 48.545 )
					if( Positive_Money_Flow_Sum <= 4.75653e+07 )
						if( Money_Flow_Ratio <= 1.74644 )
							if( Typical_Price <= 168.028 )
								if( Positive_Money_Flow <= 4.65504e+06 )
									ret := 0.064369
								if( Positive_Money_Flow > 4.65504e+06 )
									ret := -0.129145
							if( Typical_Price > 168.028 )
								if( ema12 <= 0.024998 )
									ret := -0.049975
								if( ema12 > 0.024998 )
									ret := -0.216425
						if( Money_Flow_Ratio > 1.74644 )
							if( MFI_Low <= 43.9944 )
								if( ema1 <= 169.551 )
									ret := -1.000000 // sell
								if( ema1 > 169.551 )
									ret := -0.727273 // sell
							if( MFI_Low > 43.9944 )
								if( Negative_Money_Flow_Sum <= 2.53332e+07 )
									ret := -0.727273 // sell
								if( Negative_Money_Flow_Sum > 2.53332e+07 )
									ret := 0.363636
					if( Positive_Money_Flow_Sum > 4.75653e+07 )
						if( Typical_Price <= 184.714 )
							if( tema <= 156.972 )
								if( ema12 <= -0.117439 )
									ret := 0.600000
								if( ema12 > -0.117439 )
									ret := -0.120553
							if( tema > 156.972 )
								if( ema3 <= 166.275 )
									ret := 0.171713
								if( ema3 > 166.275 )
									ret := 0.029372
						if( Typical_Price > 184.714 )
							if( MFI_High <= -20.6779 )
								if( ema3 <= 184.826 )
									ret := -0.521739
								if( ema3 > 184.826 )
									ret := 0.207207
							if( MFI_High > -20.6779 )
								if( Positive_Money_Flow <= 6.61673e+06 )
									ret := -0.162963
								if( Positive_Money_Flow > 6.61673e+06 )
									ret := -0.721519 // sell
				if( MFI_Low > 48.545 )
					if( Negative_Money_Flow <= 1.39481e+07 )
						if( Typical_Price <= 168.727 )
							if( tema <= 152.896 )
								if( Typical_Price <= 152.356 )
									ret := 0.142857
								if( Typical_Price > 152.356 )
									ret := 1.000000 // buy
							if( tema > 152.896 )
								if( MFI_Low <= 71.4276 )
									ret := -0.300290
								if( MFI_Low > 71.4276 )
									ret := 0.233577
						if( Typical_Price > 168.727 )
							if( MFI_High <= -11.0532 )
								if( ema1 <= 171.362 )
									ret := -0.117647
								if( ema1 > 171.362 )
									ret := -0.769231 // sell
							if( MFI_High > -11.0532 )
								if( Positive_Money_Flow <= 1.62947e+07 )
									ret := 0.000000
								if( Positive_Money_Flow > 1.62947e+07 )
									ret := -0.223650
					if( Negative_Money_Flow > 1.39481e+07 )
						if( Positive_Money_Flow_Sum <= 1.29557e+08 )
							if( ema13 <= 0.21899 )
								ret := 0.850000 // buy
							if( ema13 > 0.21899 )
								if( Negative_Money_Flow <= 1.60653e+07 )
									ret := 0.142857
								if( Negative_Money_Flow > 1.60653e+07 )
									ret := -0.772727 // sell
						if( Positive_Money_Flow_Sum > 1.29557e+08 )
							if( ema13 <= 0.918214 )
								if( ema3 <= 161.085 )
									ret := 0.900000 // buy
								if( ema3 > 161.085 )
									ret := 0.343750
							if( ema13 > 0.918214 )
								if( Typical_Price <= 171.174 )
									ret := 0.068966
								if( Typical_Price > 171.174 )
									ret := -0.923077 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_GOOG_1Min_7b68acf9(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)

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


